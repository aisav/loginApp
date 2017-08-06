package com.art.struts2.login.util;

import com.art.struts2.login.mapper.UserMapper;
import com.art.struts2.login.model.User;
import org.apache.ibatis.session.SqlSession;

public class UserManager {
    public static User selectUserById(int id) {
        SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
        try {
            UserMapper userMapper = sqlSession
                    .getMapper(UserMapper.class);
            return userMapper.selectUserById(id);
        } finally {
            sqlSession.close();
        }
    }
}

