package cn.edu.zua.springbootdemo.dao;

import cn.edu.zua.springbootdemo.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Dao
 * Created by ascend on 2017/8/18 13:53.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByUserName(String userName);

    User findUserByUserNameOrEmail(String userName, String email);
}
