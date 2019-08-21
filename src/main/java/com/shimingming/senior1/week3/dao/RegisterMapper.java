package com.shimingming.senior1.week3.dao;



import org.apache.ibatis.annotations.Param;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.shimingming.senior1.week3.domain.Register;
import com.shimingming.senior1.week3.vo.RegisterVo;

/**
 * @作者: 时明明
 * @日期: 2019年8月19日
 * @时间: 上午9:25:44
 */
public interface RegisterMapper extends BaseMapper<Register> {
	IPage<RegisterVo> getIPage(IPage<RegisterVo> page,@Param(Constants.WRAPPER)QueryWrapper<RegisterVo> qw);
}
