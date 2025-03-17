package org.bayat.crudpreparedstatement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
@RestController
@RequestMapping("/users/v1")
public class UserController {

        @Autowired
        private UserService userService;

        @PostMapping
        public void createUser(@RequestBody User user) throws SQLException {
            userService.createUser(user);
        }

        @GetMapping("/{id}")
        public User getUserById(@PathVariable int id) throws SQLException {
            return userService.getUserById(id);
        }

        @GetMapping
        public List<User> getAllUsers() throws SQLException {
            return userService.getAllUsers();
        }

        @PutMapping
        public void updateUser(@RequestBody User user) throws SQLException {
            userService.updateUser(user);
        }

        @DeleteMapping("/{id}")
        public void deleteUser(@PathVariable int id) throws SQLException {
            userService.deleteUser(id);
        }
    }

