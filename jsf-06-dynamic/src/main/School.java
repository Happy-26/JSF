import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: PACKAGE_NAME
 * @Date: 2021/10/18 20:17
 * explain:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ManagedBean(name = "school")
@SessionScoped
public class School {
    private String data;

    public String jump() {
        if (this.data != null) {
            if (this.data.contains("se")) {
                return "xg";
            }
        }
        return "wd";
    }
}
