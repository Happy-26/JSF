package org.example;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.util.Date;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: org.example
 * @Date: 2021/9/27 19:46
 */

@ManagedBean(name = "receipt")
@RequestScoped
public class UserBean {

    @ManagedProperty(value = "20")
    private double amount;

    private Date date;

    private  String inputInfo;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getInputInfo() {
        return inputInfo;
    }

    public void setInputInfo(String inputInfo) {
        this.inputInfo = inputInfo;
    }
}
