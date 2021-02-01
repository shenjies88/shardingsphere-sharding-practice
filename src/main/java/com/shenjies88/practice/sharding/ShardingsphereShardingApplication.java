package com.shenjies88.practice.sharding;

import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@RestController
@SpringBootApplication
public class ShardingsphereShardingApplication {

	private final JdbcTemplate jdbcTemplate;
	private final OrderMapper orderMapper;

	public static void main(String[] args) {
		SpringApplication.run(ShardingsphereShardingApplication.class, args);
	}

	@GetMapping("/get1")
	public List<Map<String, Object>> get1() {
		return jdbcTemplate.queryForList("SELECT * FROM t_order WHERE createtime = '2021-01-01 00:00:00'");
	}

	@GetMapping("/get1-m")
	public List<Order> get1M() {
		return orderMapper.get1(new Date());
	}

	@GetMapping("/get2")
	public List<Map<String, Object>> get2() {
		return jdbcTemplate.queryForList("SELECT * FROM t_order WHERE createtime = '2021-02-01 00:00:00'");
	}

	@GetMapping("/insert1")
	public void insert1() {
		jdbcTemplate.execute("INSERT INTO t_order (order_id,name,createtime) VALUE (1,'1表插入的','2021-01-01 00:00:00')");
	}

	@GetMapping("/insert1-m")
	public void insert1M() {
		orderMapper.insert1(new Date());
	}

	@GetMapping("/insert2")
	public void insert2() {
		jdbcTemplate.execute("INSERT INTO t_order (order_id,name,createtime) VALUE (2,'2表插入的','2021-02-01 00:00:00')");
	}
}
