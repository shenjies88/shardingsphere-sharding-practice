package com.shenjies88.practice.sharding;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

/**
 * @author shenjies88
 * @since 2021/2/1-4:36 PM
 */
@Mapper
public interface OrderMapper {

    @Select("SELECT * FROM t_order WHERE createtime = #{createtime}")
    List<Order> get1(Date createtime);

    @Insert("INSERT INTO t_order (order_id,name,createtime) VALUE (2,'2表插入的',#{createtime})")
    void insert1(Date createtime);
}
