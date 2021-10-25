import cn.hutool.captcha.CircleCaptcha;
import org.junit.Test;
import team.niit.util.MyCaptchaUtil;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: PACKAGE_NAME
 * @Date: 2021/10/21 23:59
 */
public class Test01 {
    @Test
    public void ge() {
        MyCaptchaUtil.generateCaptcha();
    }

    @Test
    public void test02() {
        //定义图形验证码的长、宽、验证码字符数、干扰元素个数
        CircleCaptcha captcha = cn.hutool.captcha.CaptchaUtil.createCircleCaptcha(110, 40, 4, 20);

        try (OutputStream outputStream = new FileOutputStream("../../web/res/captcha.png")){
            //CircleCaptcha captcha = new CircleCaptcha(200, 100, 4, 20);
            //图形验证码写出，可以写出到文件，也可以写出到流
            for (byte imageByte : captcha.getImageBytes()) {
                outputStream.write(imageByte);
            }

            // captcha.write(outputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}