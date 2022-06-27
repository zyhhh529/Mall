package com.yunheng.mall.order.dao;

import com.yunheng.mall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author yunheng
 * @email yunhengz529@gmail.com
 * @date 2022-06-26 18:48:46
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
