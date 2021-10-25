package team.niit.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ViewBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String submit() {
        return "next";
    }

    @Override
    public String toString() {
        return "ViewBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
