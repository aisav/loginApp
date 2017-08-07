package com.art.struts2.login.action;

import com.art.struts2.login.model.User;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.Date;

/**
 * Created by user on 05.08.2017.
 */
public class LoginAction extends ActionSupport {

    private String name;
    private String password;
    private Date nowDate;

    @Override
    public void validate(){

        boolean isFieldEmpty = false;
        if (name==null || name.length()==0) {
            addFieldError("name", getText("error.enter.name"));
            isFieldEmpty = true;
        }
        if (password==null || password.length()==0) {
            addFieldError("password", getText("error.enter.password"));
            isFieldEmpty = true;
        }
        if(!isFieldEmpty) {
//        User user; //= UserManager.selectUserById(1);
            int i = 1;
            Reader reader = null;
            try {
                reader = Resources.getResourceAsReader("mybatis.xml");
            } catch (IOException e) {
                e.printStackTrace();
            }
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession session = sqlSessionFactory.openSession();

            //select a particular student  by  id
            User user = (User) session.selectOne("User.getById", 1);



            session.commit();
            session.close();
            if (name.equals(user.getName()) && password.equals(user.getPassword())) {
                addActionMessage("login.success");
            } else {
                addActionError("login.wrong");
            }
        }
    }

    @Override
    public String execute() throws Exception {
        nowDate = new Date();
        return ActionSupport.SUCCESS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getNowDate() {
        return nowDate;
    }
}