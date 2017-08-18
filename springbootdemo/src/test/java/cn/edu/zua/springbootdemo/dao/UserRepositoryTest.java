package cn.edu.zua.springbootdemo.dao;

import cn.edu.zua.springbootdemo.modal.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Test
 * Created by ascend on 2017/8/18 13:58.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@WebAppConfiguration
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        userRepository.save(new User("zhangsan", "123456", "zhangsan@outlook.com", "laozhang", LocalDateTime.now().format(formatter)));
        userRepository.save(new User("lisi", "123456", "lisi@outlook.com", null, LocalDateTime.now().format(formatter)));

        Assert.assertEquals("size is right", 2, userRepository.findAll().size());
        Assert.assertEquals("nickName of zhangsan", "laozhang", userRepository.findUserByUserName("zhangsan").getNickName());

    }
}
