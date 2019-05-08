package com.neuedu.springdata.entity;

import lombok.Data;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Table(name="t_user")
@Entity
public class User implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true,length = 50)
    private String userName;

    @Column(nullable = false,length = 50)
    private String password;
    @Column(name="login_lock")
    private Integer loginLock;
    @Column
    private Date createTime;
}
