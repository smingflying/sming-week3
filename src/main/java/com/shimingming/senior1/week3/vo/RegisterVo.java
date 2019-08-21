package com.shimingming.senior1.week3.vo;

import java.util.Date;

import com.shimingming.senior1.week3.domain.Profession;
import com.shimingming.senior1.week3.domain.Register;

/**
 * @作者: 时明明
 * @日期: 2019年8月19日
 * @时间: 上午9:55:04
 */
public class RegisterVo extends Register{
	private Profession pro1;
	private Profession pro2;
	public Profession getPro1() {
		return pro1;
	}
	public void setPro1(Profession pro1) {
		this.pro1 = pro1;
	}
	public Profession getPro2() {
		return pro2;
	}
	public void setPro2(Profession pro2) {
		this.pro2 = pro2;
	}
	public RegisterVo(Integer id, String name, String sex, String addr, String company, String sxzy, Integer pid1,
			Integer pid2, String zyzgzsid, String registid, Date yxdate, Profession pro1, Profession pro2) {
		super(id, name, sex, addr, company, sxzy, pid1, pid2, zyzgzsid, registid, yxdate);
		this.pro1 = pro1;
		this.pro2 = pro2;
	}
	public RegisterVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegisterVo(Integer id, String name, String sex, String addr, String company, String sxzy, Integer pid1,
			Integer pid2, String zyzgzsid, String registid, Date yxdate) {
		super(id, name, sex, addr, company, sxzy, pid1, pid2, zyzgzsid, registid, yxdate);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return super.toString()+"RegisterVo [pro1=" + pro1 + ", pro2=" + pro2 + "]";
	}
	
	 
	
}
