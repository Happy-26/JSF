package priv.happy.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;


@ManagedBean(name = "student")
@SessionScoped
public class StudentBean {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void vadadsad(FacesContext ctx, UIComponent ui, Object value) {
        String str = value.toString();
        System.out.println(str);
        if(str.contains("!")||str.contains("@")||str.contains("#")||
                str.contains("$")||str.contains("%")||str.contains("*")||
                str.contains("~")||str.contains("^")||str.contains(",")||
                str.contains("`")||str.contains("&")||str.contains(".")
        ) {
            throw new ValidatorException(new FacesMessage());
        }
    }
}
