package cn.springlogic.user.jpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by figo-007 on 2017/4/6.
 */
@Entity
@Data
public class Role {

    @Id
    @GeneratedValue
    private int id;

    private String name;
}
