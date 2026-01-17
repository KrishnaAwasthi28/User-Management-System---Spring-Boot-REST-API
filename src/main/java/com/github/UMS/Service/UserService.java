package com.github.UMS.Service;

import com.github.UMS.DTO.UpdateUsersDTO;
import com.github.UMS.DTO.UserDTO;
import com.github.UMS.Entity.User;
import com.github.UMS.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public Optional<User> getUserById(long id){
        return userRepository.findById(id);
    }

    public void addUser(UserDTO userDTO) {
        User user=new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setMobile(userDTO.getMobile());
        user.setBirthDate(userDTO.getBirthDate());
        userRepository.save(user);
    }

    public User updateUser(long id, UpdateUsersDTO dto) {
        User user=userRepository.findById(id).orElseThrow(()-> new RuntimeException("User not found"));
        if(dto.getName()!=null && !dto.getName().isBlank()){
            user.setName(dto.getName());
        }
        if(dto.getMobile()!=null){
            userRepository.findByMobile(dto.getMobile())
                    .filter(existingUser -> !Objects.equals(existingUser.getId(), id))
                    .ifPresent(existingUser -> {
                        throw new RuntimeException("Mobile number already in use");
                    });

            user.setMobile(dto.getMobile());
        }
        if (dto.getBirthDate() != null) {
            user.setBirthDate(dto.getBirthDate());
        }
        return userRepository.save(user);
    }

    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }
}
