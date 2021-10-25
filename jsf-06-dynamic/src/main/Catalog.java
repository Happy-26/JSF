import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * 
 */

/**
 * @Author    Matr1x
 * @ProjectName  JSF_ch4_demo2
 * @Manba     >>>Thinking twice,Code Once>>
 * @Description   
 * @Date     2021年10月18日  上午7:14:21
 */
@ManagedBean
@RequestScoped
public class Catalog {
    private int id;
    private String name;
    private String greeting;
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
    public String getGreeting() {
        String id = "Employee ID = " + this.id;
        String name = "EmployeeName = " + this.name;
        this.greeting = id + " & " + name;
        return this.greeting;
    }
    public String checkId(){
        if(this.id>=1 && this.id<=3)
            return "success";
        else
            return "error";
    }
}
