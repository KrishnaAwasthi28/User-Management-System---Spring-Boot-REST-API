package com.github.UMS.Controller;

import com.github.UMS.DTO.UpdateUsersDTO;
import com.github.UMS.DTO.UserDTO;
import com.github.UMS.Entity.User;
import com.github.UMS.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public Optional<User> getUserById(@PathVariable long id){
        return userService.getUserById(id);
    }

    @PostMapping("/users")
    public void addUser(@RequestBody @Validated UserDTO userDTO){
        userService.addUser(userDTO);
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<User> updateUser(@PathVariable long id, @RequestBody UpdateUsersDTO updateUsersDTO){
        User updatedUser=userService.updateUser(id,updateUsersDTO);
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("users/{id}")
    public void deleteUser(@PathVariable long id){
        userService.deleteUser(id);
    }
}
