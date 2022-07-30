package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author caoliang
 * @email 119793898@qq.com
 * @date 2022-07-30 11:14:42
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
