package com.shimingming.senior1.week3.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shimingming.senior1.week3.domain.Register;
import com.shimingming.senior1.week3.vo.RegisterVo;

/**
 * @作者: 时明明
 * @日期: 2019年8月19日
 * @时间: 上午9:27:28
 */
public interface IRegisterService extends IService<Register> {
	IPage<RegisterVo> getIPage(IPage<RegisterVo> page,QueryWrapper<RegisterVo> qw);
}
