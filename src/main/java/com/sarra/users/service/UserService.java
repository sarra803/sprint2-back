package com.sarra.users.service;

import com.sarra.users.entities.Role;

import com.sarra.users.entities.User;
import java.util.List;


public interface UserService {
User saveUser(User user);
User findUserByUsername (String username);
Role addRole(Role role);
User addRoleToUser(String username, String rolename);
List <User>findAllUsers();
}
