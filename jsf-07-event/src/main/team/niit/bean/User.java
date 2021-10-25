package team.niit.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: team.niit.bean
 * @Date: 2021/10/19 9:20
 * explain:
 */
@ManagedBean(name = "user")
@SessionScoped
public class User {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
