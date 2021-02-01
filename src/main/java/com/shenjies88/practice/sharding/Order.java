package com.shenjies88.practice.sharding;

import lombok.Data;

import java.util.Date;

/**
 * @author shenjies88
 * @since 2021/2/1-4:37 PM
 */
@Data
public class Order {

    private Integer id;

    private Integer orderId;

    private String name;

    private Date createtime;
}
