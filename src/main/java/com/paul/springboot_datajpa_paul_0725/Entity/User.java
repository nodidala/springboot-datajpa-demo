package com.paul.springboot_datajpa_paul_0725.Entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.*;
import javax.persistence.GeneratedValue;

/**
 * @author paul
 * @Description 实体类
 * @date 2019/7/25 15:37
 */

@Entity
@Table(name = "test_user")
@Data
public class User {

    @Id
    @GenericGenerator(name = "idGenerator", strategy = "uuid")
    @GeneratedValue(generator = "idGenerator")
    private String id;

    @Column(name = "username", unique = true, nullable = false, length = 64)
    private String username;

    @Column(name = "password", nullable = false, length = 64)
    private String password;

    @Column(name = "email", length = 64)
    private String email;
}
