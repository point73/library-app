package com.group.libraryapp.dto.user.repository;

import com.group.libraryapp.dto.user.request.UserUpdateRequest;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserRepository {

    public boolean isUserNotExist(JdbcTemplate jdbcTemplate, long id) {
        String sql = "SELECT * FROM user WHERE id = ?";
        return jdbcTemplate.query(sql, (rs, rowNum) -> 0, id).isEmpty();
    }
    public void updateUserName(JdbcTemplate jdbcTemplate, String name, long id) {
        String sql = "UPDATE user SET name = ? WHERE id = ?";
        jdbcTemplate.update(sql, name, id);
    }
}
