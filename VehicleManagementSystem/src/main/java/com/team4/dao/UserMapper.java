package com.team4.dao;

import org.springframework.stereotype.Repository;
import com.team4.entity.User;
import java.util.List;

@Repository
public interface UserMapper {
    public List<User> getAllUser();
}
