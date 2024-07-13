package com.group.libraryapp.dto.user.Service.user;

import com.group.libraryapp.dto.user.repository.UserRepository;
import com.group.libraryapp.dto.user.request.UserUpdateRequest;
import org.springframework.jdbc.core.JdbcTemplate;

public class userService {

    private final UserRepository userRepository = new UserRepository();

    public void updateUser(JdbcTemplate jdbcTemplate, UserUpdateRequest request) {
        if (userRepository.isUserNotExist(jdbcTemplate, request.getId())) {
            throw new IllegalArgumentException();
        }
        userRepository.updateUserName(jdbcTemplate, request.getName(), request.getId());
    }
}
