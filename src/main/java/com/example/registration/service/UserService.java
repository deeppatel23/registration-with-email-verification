package com.example.registration.service;

import com.example.registration.entity.User;
import org.springframework.http.ResponseEntity;

public interface UserService {

    ResponseEntity<?> saveUser(User user);

    ResponseEntity<?> confirmEmail(String confirmationToken);
}
