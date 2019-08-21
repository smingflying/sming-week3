package com.shimingming.senior1.week3.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shimingming.senior1.week3.dao.RegisterMapper;
import com.shimingming.senior1.week3.domain.Register;
import com.shimingming.senior1.week3.service.IRegisterService;
import com.shimingming.senior1.week3.vo.RegisterVo;

/**
 * @作者: 时明明
 * @日期: 2019年8月19日
 * @时间: 上午9:28:46
 */
@Service
public class RegisterServiceImpl extends ServiceImpl<RegisterMapper, Register> implements IRegisterService {
	
	public IPage<RegisterVo> getIPage(IPage<RegisterVo> page,QueryWrapper<RegisterVo> qw) {
		
		return  this.baseMapper.getIPage(page,qw);
	}

	

}
