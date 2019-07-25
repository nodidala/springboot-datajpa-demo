package com.paul.springboot_datajpa_paul_0725.Service;

import com.paul.springboot_datajpa_paul_0725.Entity.User;

import java.util.List;

/**
 * @author paul
 * @date 2019/7/25 15:48
 */
public interface UserService {
     List<User> findAll();
}
