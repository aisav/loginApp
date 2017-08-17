package com.art.struts2.login.model;

/**
 * Created by user on 05.08.2017.
 */
public class User {

    private Integer id;
    private String name;
    private String password;

    public User( String name, String password) {
        super();
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public User() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String userName) {
        this.name = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String userPassword) {
        this.password = userPassword;
    }


}
