package com.shimingming.senior1.week3.domain;



import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @作者: 时明明
 * @日期: 2019年8月19日
 * @时间: 上午9:12:04
 */
@TableName("t_engineer")
public class Register {
	@TableId(type=IdType.AUTO)
	private Integer id;
	private String name;
	private String sex;
	private String addr;
	private String company;
	private String sxzy;
	private Integer pid1;
	private Integer pid2;
	private String zyzgzsid;
	private String registid;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date yxdate;
	public Register(Integer id, String name, String sex, String addr, String company, String sxzy, Integer pid1,
			Integer pid2, String zyzgzsid, String registid, Date yxdate) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.addr = addr;
		this.company = company;
		this.sxzy = sxzy;
		this.pid1 = pid1;
		this.pid2 = pid2;
		this.zyzgzsid = zyzgzsid;
		this.registid = registid;
		this.yxdate = yxdate;
	}
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Register [id=" + id + ", name=" + name + ", sex=" + sex + ", addr=" + addr + ", company=" + company
				+ ", sxzy=" + sxzy + ", pid1=" + pid1 + ", pid2=" + pid2 + ", zyzgzsid=" + zyzgzsid + ", registid="
				+ registid + ", yxdate=" + yxdate + "]";
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getSxzy() {
		return sxzy;
	}
	public void setSxzy(String sxzy) {
		this.sxzy = sxzy;
	}
	public Integer getPid1() {
		return pid1;
	}
	public void setPid1(Integer pid1) {
		this.pid1 = pid1;
	}
	public Integer getPid2() {
		return pid2;
	}
	public void setPid2(Integer pid2) {
		this.pid2 = pid2;
	}
	public String getZyzgzsid() {
		return zyzgzsid;
	}
	public void setZyzgzsid(String zyzgzsid) {
		this.zyzgzsid = zyzgzsid;
	}
	public String getRegistid() {
		return registid;
	}
	public void setRegistid(String registid) {
		this.registid = registid;
	}
	public Date getYxdate() {
		return yxdate;
	}
	public void setYxdate(Date yxdate) {
		this.yxdate = yxdate;
	}
	
	
	
}
