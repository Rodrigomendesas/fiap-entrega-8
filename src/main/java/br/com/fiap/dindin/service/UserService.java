package br.com.fiap.dindin.service;

import br.com.fiap.dindin.model.User;
import java.util.List;

public interface UserService {
    User findUserByUsername(String username);
    User saveUser(User user);
    User getUserById(Long id);
    User updateUser(Long id, User user);
    void deleteUser(Long id);
    List<User> findUsersByRole(String role);
    boolean existsByUsername(String username);
    boolean authenticateUser(String username, String password);
    List<User> saveAllUsers(List<User> users);
}
