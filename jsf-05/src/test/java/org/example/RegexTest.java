package org.example;

import org.junit.Test;

import java.util.regex.Pattern;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: org.example
 * @Date: 2021/9/28 17:25
 */
public class RegexTest {
    @Test
    public void test01(){
        String regex = "\\w*@\\w*.[a-z]*";
        String regex1 = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z0-9]{2,6}$";

        String myregex = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*\\.[a-zA-Z0-9]{2,6}$";

        System.out.println(Pattern.matches(myregex, "488127311@qq.com"));
        System.out.println(Pattern.matches(myregex, "488127311@163.com"));
        System.out.println(Pattern.matches(myregex, "488127311@outlook.com"));
        System.out.println(Pattern.matches(myregex, "488127311@qwe.qom"));
    }
}
