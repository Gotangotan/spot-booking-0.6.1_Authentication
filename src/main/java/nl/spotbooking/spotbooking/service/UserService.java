package nl.spotbooking.spotbooking.service;

import nl.spotbooking.spotbooking.model.Authority;
import nl.spotbooking.spotbooking.model.User;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;

public interface UserService {

    String createUser(User user);
    void updateUser(String username, User user);
    void deleteUser(String username);
    Collection<User> getUsers();
    Optional<User> getUser(String username);
    Set<Authority> getAuthorities(String username);
    void addAuthority(String username, String authority);
    void removeAuthority(String username, String authority);

}