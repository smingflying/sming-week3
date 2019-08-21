package com.shimingming.senior1.week3.controller;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shimingming.senior1.week3.domain.Profession;
import com.shimingming.senior1.week3.domain.Register;
import com.shimingming.senior1.week3.service.IProfessionService;
import com.shimingming.senior1.week3.service.IRegisterService;
import com.shimingming.senior1.week3.vo.RegisterVo;

/**
 * @作者: 时明明
 * @日期: 2019年8月19日
 * @时间: 上午9:53:33
 */
@Controller
public class RegisterController {
	@Resource
	private IRegisterService irs;
	@Resource
	private IProfessionService ips;
	@GetMapping("/")
	public String getList(Model m,@RequestParam(defaultValue = "1")Integer pageNum,
			@RequestParam(required = false)String mh1,
			@RequestParam(required = false)String mh2,
			@RequestParam(required = false)String mh3
			) {
		QueryWrapper<RegisterVo> qw  =new  QueryWrapper<RegisterVo>();
		qw=mh1!=null&&!"".equals(mh1)?qw.like("t_engineer.name", mh1):qw;
		qw=mh1!=null&&!"".equals(mh2)?qw.like("t_engineer.addr", mh2):qw;
		qw=mh1!=null&&!"".equals(mh3)?qw.like("p1.name", mh3).or().like("p2.name", mh3):qw;
	
		Page<RegisterVo> page = new Page<RegisterVo>(pageNum,10);
		IPage<RegisterVo> page2 = irs.getIPage(page,qw);
		
		m.addAttribute("page", page2);
		m.addAttribute("mh1", mh1);
		m.addAttribute("mh2", mh2);
		m.addAttribute("mh3",mh3);
		return "list";
	}
	@GetMapping("toUpdate")
	public String toUpdate(Integer id,Model m) {
		List<Profession> list = ips.list();
		System.out.println(list);
		Register byId = irs.getById(id);
		m.addAttribute("reg", byId);
		m.addAttribute("list", list);
		return "toupdate";
	}

	@RequestMapping("update")
	public String update(Register reg) {
		irs.saveOrUpdate(reg);
		return "redirect:/";
		
	}
	@RequestMapping("dels")
	public String dels(Integer[] ids) {
		List<Integer> asList = Arrays.asList(ids);
		 irs.removeByIds(asList);
		return "redirect:/";
		
	}
}
