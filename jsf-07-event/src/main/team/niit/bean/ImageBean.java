package team.niit.bean;

import cn.hutool.captcha.CircleCaptcha;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import team.niit.util.MyCaptchaUtil;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.HtmlGraphicImage;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: team.niit.bean
 * @Date: 2021/10/21 22:46
 */
@ManagedBean
@SessionScoped
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImageBean {
    private HtmlGraphicImage htmlGraphicImage;


    @PostConstruct
    public void show() {
        MyCaptchaUtil.generateCaptcha();
        htmlGraphicImage = new HtmlGraphicImage();
        htmlGraphicImage.setValue("res/captcha.png");
    }


}
