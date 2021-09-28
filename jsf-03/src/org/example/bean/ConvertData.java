package org.example.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.util.Date;

@ManagedBean(name = "data")
@RequestScoped
public class ConvertData {
    @ManagedProperty(value = "0")
    private double no;
    private Date date;

    public ConvertData(){}

    public double getNo() {
        return no;
    }

    public void setNo(double no) {
        this.no = no;
    }

    public Date getDate() {
        // 初始化时间
        date = new Date();
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ConvertData(double no, Date date) {
        this.no = no;
        this.date = date;
    }
}
