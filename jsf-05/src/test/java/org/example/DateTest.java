package org.example;

import org.junit.Test;

import java.util.Date;

/**
 * @Author: HAPPY
 * @Project_name: JSF
 * @Package_name: org.example
 * @Date: 2021/9/28 9:03
 */
public class DateTest {
    @Test
    public void test01(){
        Date date = new Date();
        System.out.println(date.getTime());
    }
}
