package com.paul.springboot_datajpa_paul_0725.Service.UserServiceImpl;

import com.paul.springboot_datajpa_paul_0725.Dao.UserDao;
import com.paul.springboot_datajpa_paul_0725.Entity.User;
import com.paul.springboot_datajpa_paul_0725.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author paul
 * @date 2019/7/25 15:48
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
