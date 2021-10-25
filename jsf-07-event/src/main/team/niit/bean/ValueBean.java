package team.niit.bean;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.html.HtmlGraphicImage;
import javax.faces.component.html.HtmlInputText;
import javax.faces.event.ValueChangeEvent;
import java.awt.*;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: team.niit.bean
 * @Date: 2021/10/20 19:52
 * explain:
 */
@ManagedBean
@RequestScoped
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ValueBean {
    private HtmlInputText id, msg1, msg2, msg3, msg4;

    private HtmlGraphicImage htmlGraphicImage;

    // bean方法实现值更改监听器，处理值更改事件
    public void changeOperation(ValueChangeEvent valueChangeEvent) {
        String idVal = valueChangeEvent.getNewValue().toString();
        StringBuilder m1 = new StringBuilder();
        StringBuilder m2 = new StringBuilder();
        StringBuilder m3 = new StringBuilder();
        StringBuilder m4 = new StringBuilder();

        // 直接调用方法：
        //    1. 本类方法
        //    2. 父类方法
        //    3. 静态导入方法，可以接调用
        // 根据id对其他组件赋值
        judgeIdShowDifferentMsg(idVal, m1, m2, m3, m4);

        // 将更新后的字符传入相应的inputText组件
        msg1.setValue(m1);
        msg2.setValue(m2);
        msg3.setValue(m3);
        msg4.setValue(m4);
    }

    private void judgeIdShowDifferentMsg(String idVal, StringBuilder m1, StringBuilder m2, StringBuilder m3, StringBuilder m4) {
        switch (idVal){
            case "001":
                m1.append("msg1111111111");
                m2.append("msg22222222222222");
                m3.append("msg33333333");
                m4.append("msg44444444");
                break;
            case "002":
                m1.append("121212121");
                m2.append("34343434");
                m3.append("565656565");
                m4.append("7878787878");
                break;
            case "003":
                m1.append("aaaaaa");
                m2.append("bbbbbbbbb");
                m3.append("ccccccccc");
                m4.append("dddddd");
                break;
        }
    }
}
