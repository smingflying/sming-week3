package com.shimingming.senior1.week3.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @作者: 时明明
 * @日期: 2019年8月19日
 * @时间: 上午9:24:26
 */
@TableName("t_profession")
public class Profession {
	@TableId(type=IdType.AUTO)
	private Integer id;
	private String name;
	public Profession(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Profession() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Profession [id=" + id + ", name=" + name + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
