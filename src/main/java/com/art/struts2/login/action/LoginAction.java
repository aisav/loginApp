package com.art.struts2.login.action;

import com.art.struts2.login.model.User;
import com.art.struts2.login.util.UserManager;
import com.opensymphony.xwork2.ActionSupport;

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

        if (name==null || name.length()==0)
            addFieldError("name", getText("error.enter.name"));
        if (password==null || password.length()==0)
            addFieldError("password", getText("error.enter.password"));
        User user = UserManager.selectUserById(1);
        if(name.equals(user.getUserName()) && password.equals(user.getUserPassword())){

        }
        else {
            addActionError("wrong username and password");
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