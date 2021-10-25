import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 */

/**
 * @Author Matr1x
 * @ProjectName JSF_ch4_demo2
 * @Manba     >>>Thinking twice,Code Once>>
 * @Description
 * @Date 2021��10��18��  ����7:01:50
 */
@ManagedBean(name = "team.niit.bean")
@RequestScoped
public class Bean {
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String selectJudge() {
        int len = this.getInfo().toString().length();
        if (len > 5)
            return "great";
        else
            return "less";
    }
}
