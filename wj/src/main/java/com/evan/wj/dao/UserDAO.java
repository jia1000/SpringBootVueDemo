package com.evan.wj.dao;


// Data Access Object（数据访问对象，DAO）即用来操作数据库的对象，
// 这个对象可以是我们自己开发的，也可以是框架提供的。
// 这里我们通过继承 JpaRepository 的方式构建 DAO。

import com.evan.wj.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User,Integer> {
    User findByUsername(String username);

    User getByUsernameAndPassword(String username,String password);
}
