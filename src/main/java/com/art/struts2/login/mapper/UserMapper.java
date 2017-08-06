package com.art.struts2.login.mapper;


import com.art.struts2.login.model.User;

public interface UserMapper {
    public User selectUserById(int id);
}
