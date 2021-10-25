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
 * @Date     2021年10月18日  上午7:29:48
 */
@ManagedBean
@RequestScoped
public class BeanAccount {
    
    private String radioOption;
    private boolean flag;

    public String getRadioOption() {
        return radioOption;
    }

    public void setRadioOption(String radioOption) {
        this.radioOption = radioOption;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    
    
    public boolean SelectAccount(){
        if(getRadioOption().toString().equals("Credit"))
            flag =true;
        else
            flag =false;
        return flag;
    }
    
}
