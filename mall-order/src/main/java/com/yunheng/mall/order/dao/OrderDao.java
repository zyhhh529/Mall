package com.yunheng.mall.order.dao;

import com.yunheng.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author yunheng
 * @email yunhengz529@gmail.com
 * @date 2022-06-26 18:48:45
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
