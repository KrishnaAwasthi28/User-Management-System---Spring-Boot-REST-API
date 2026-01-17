<h1>🚀 User Management System – Spring Boot REST API</h1>

<p>
A clean and scalable <strong>User Management REST API</strong> built using 
<strong>Spring Boot</strong> and <strong>Spring Data JPA</strong>, implementing full 
<strong>CRUD operations</strong> with DTO-based architecture and REST best practices.
</p>

<hr/>

<h2>📌 Features</h2>
<ul>
  <li>Create a new user</li>
  <li>Get all users</li>
  <li>Get user by ID</li>
  <li>Update user details (partial update)</li>
  <li>Delete user</li>
  <li>DTO-based request handling</li>
  <li>Clean Controller → Service → Repository architecture</li>
  <li>Structured API responses with success messages</li>
</ul>

<hr/>

<h2>🛠️ Tech Stack</h2>
<ul>
  <li>Java</li>
  <li>Spring Boot</li>
  <li>Spring Data JPA</li>
  <li>Hibernate</li>
  <li>MySQL</li>
  <li>Maven</li>
  <li>Postman</li>
</ul>

<hr/>

<h2>📂 Project Structure</h2>
<pre>
src/main/java/com/github/UMS
│
├── Controller
│   └── UserController.java
│
├── Service
│   └── UserService.java
│
├── Repository
│   └── UserRepository.java
│
├── DTO
│   ├── CreateUserDTO.java
│   └── UpdateUserDTO.java
│
├── Entity
│   └── User.java
│
├── Response
│   └── ApiResponse.java
│
└── UmsApplication.java
</pre>

<hr/>

<h2>📊 Database Schema</h2>
<table border="1" cellpadding="8" cellspacing="0">
  <tr>
    <th>Field</th>
    <th>Type</th>
    <th>Constraints</th>
  </tr>
  <tr>
    <td>id</td>
    <td>BIGINT</td>
    <td>Primary Key, Auto Increment</td>
  </tr>
  <tr>
    <td>name</td>
    <td>VARCHAR(255)</td>
    <td>NOT NULL</td>
  </tr>
  <tr>
    <td>user_email</td>
    <td>VARCHAR(255)</td>
    <td>UNIQUE, NOT NULL</td>
  </tr>
  <tr>
    <td>mobile_no</td>
    <td>VARCHAR(255)</td>
    <td>UNIQUE, NULLABLE</td>
  </tr>
  <tr>
    <td>birth_date</td>
    <td>DATE</td>
    <td>NULLABLE</td>
  </tr>
  <tr>
    <td>created_at</td>
    <td>DATETIME(6)</td>
    <td>Auto Generated</td>
  </tr>
</table>

<hr/>

<h2>🔗 API Endpoints</h2>

<h3>➕ Create User</h3>
<pre>
POST /users
</pre>
<pre>
{
  "name": "Krishna Sharma",
  "userEmail": "krishna.sharma@gmail.com",
  "mobileNo": "9876543210",
  "birthDate": "2001-05-14"
}
</pre>

<h3>📥 Get All Users</h3>
<pre>
GET /users
</pre>

<h3>🔍 Get User by ID</h3>
<pre>
GET /users/{id}
</pre>

<h3>✏️ Update User (Partial Update)</h3>
<pre>
PUT /users/{id}
</pre>
<pre>
{
  "name": "Krishna Awasthi",
  "mobileNo": "9998887776"
}
</pre>

<h3>❌ Delete User</h3>
<pre>
DELETE /users/{id}
</pre>

<hr/>

<h2>✅ Best Practices Followed</h2>
<ul>
  <li>DTOs used instead of exposing entities</li>
  <li>Partial update implementation</li>
  <li>Database-managed primary keys</li>
  <li>Clean separation of concerns</li>
  <li>Proper HTTP status codes</li>
  <li>Consistent API response structure</li>
</ul>

<hr/>

<h2>▶️ How to Run the Project</h2>
<ol>
  <li>
    Clone the repository:
    <pre>
git clone https://github.com/your-username/user-management-system-springboot.git
    </pre>
  </li>
  <li>
    Configure <code>application.properties</code>:
    <pre>
spring.datasource.url=jdbc:mysql://localhost:3306/your_db
spring.datasource.username=your_username
spring.datasource.password=your_password
    </pre>
  </li>
  <li>
    Run the application:
    <pre>
mvn spring-boot:run
    </pre>
  </li>
</ol>

<hr/>

<h2>🚀 Future Enhancements</h2>
<ul>
  <li>Global exception handling using @ControllerAdvice</li>
  <li>Pagination and sorting</li>
  <li>Soft delete functionality</li>
  <li>Authentication and authorization (JWT)</li>
  <li>Role-based access control</li>
</ul>

<hr/>

<h2>👨‍💻 Author</h2>
<p>
<strong>Krishna Awasthi</strong><br/>
Backend / Java Developer
</p>

<hr/>

<h3>⭐ Note</h3>
<p>
This project demonstrates clean backend architecture and RESTful API design,
making it suitable for portfolio and interview presentation.
</p>
