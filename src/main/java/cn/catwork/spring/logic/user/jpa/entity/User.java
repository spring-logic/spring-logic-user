package cn.catwork.spring.logic.user.jpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by figo-007 on 2017/4/6.
 */
@Entity
@Data
public class User {

    @Id
    @GeneratedValue
    private int id;

    private String username;
    private String password;
}
