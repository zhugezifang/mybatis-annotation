package com.gdz.bean;

import lombok.Data;

import java.util.Date;

/**
 * @Author: guandezhi
 * @Date: 2019/1/17 10:41
 */
@Data
public class User {
    private Long id;
    private String name;
    private Long age;
    private Date time;
}
