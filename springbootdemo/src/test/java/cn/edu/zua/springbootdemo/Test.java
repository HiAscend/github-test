package cn.edu.zua.springbootdemo;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Test
 * Created by ascend on 2017/8/18 14:02.
 */
public class Test {
    @org.junit.Test
    public void test() {
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}
