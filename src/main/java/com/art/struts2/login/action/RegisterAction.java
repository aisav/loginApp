package com.art.struts2.login.action;

import com.opensymphony.xwork2.ActionSupport;

import java.util.Date;

public class RegisterAction extends ActionSupport {
    public Date getNowDate() {
        return nowDate;
    }

    public void setNowDate(Date nowDate) {
        this.nowDate = nowDate;
    }

    private Date nowDate;

    @Override
    public String execute() throws Exception {
        nowDate = new Date();
        return ActionSupport.SUCCESS;
    }
}
