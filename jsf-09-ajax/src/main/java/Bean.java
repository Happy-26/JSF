import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
@RequestScoped
public class Bean {
    private String uid;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void valiId(FacesContext ctx, UIComponent ui, Object value) {
        String str = value.toString();
        if(str.contains("!")||str.contains("@")||str.contains("#")||
                str.contains("$")||str.contains("%")||str.contains("*")||
                str.contains("~")||str.contains("^")||str.contains(",")||
                str.contains("`")||str.contains("&")||str.contains(".")
        ) {
            throw new ValidatorException(new FacesMessage());
        }
    }
}