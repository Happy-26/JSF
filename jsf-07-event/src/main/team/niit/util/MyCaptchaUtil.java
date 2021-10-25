package team.niit.util;

import cn.hutool.captcha.CircleCaptcha;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: team.niit.util
 * @Date: 2021/10/21 23:56
 */
public class MyCaptchaUtil {
    public static void generateCaptcha() {
        //定义图形验证码的长、宽、验证码字符数、干扰元素个数
        CircleCaptcha captcha = cn.hutool.captcha.CaptchaUtil.createCircleCaptcha(110, 40, 4, 20);

        File file = new File("E:\\JSF\\jsf-07-event\\web\\res\\captcha.png");
        try (FileOutputStream outputStream = new FileOutputStream(file)){
            //CircleCaptcha captcha = new CircleCaptcha(200, 100, 4, 20);
            //图形验证码写出，可以写出到文件，也可以写出到流
            for (byte imageByte : captcha.getImageBytes()) {
                outputStream.write(imageByte);
            }
            outputStream.flush();
            // captcha.write(outputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
