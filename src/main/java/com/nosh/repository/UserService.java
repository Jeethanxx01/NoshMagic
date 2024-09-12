package com.nosh.repository;

import com.nosh.model.User;

public interface UserService {

    public User findUserByJwtToken(String jwt)throws Exception;

    public User findUserByEmail(String email)throws Exception;
}
