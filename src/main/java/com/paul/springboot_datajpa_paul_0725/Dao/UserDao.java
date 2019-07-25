package com.paul.springboot_datajpa_paul_0725.Dao;


import com.paul.springboot_datajpa_paul_0725.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author paul
 * @date 2019/7/25 15:44
 */

public interface UserDao extends JpaRepository<User,String> {

}
