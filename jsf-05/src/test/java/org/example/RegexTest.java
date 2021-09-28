package org.example;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;
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
        String regex = "\\d*@qq.com";
        System.out.println(Pattern.matches(regex, "488127311@qq.com"));
    }
}
