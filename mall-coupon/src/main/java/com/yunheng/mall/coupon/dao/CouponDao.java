package com.yunheng.mall.coupon.dao;

import com.yunheng.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author yunheng
 * @email yunhengz529@gmail.com
 * @date 2022-06-26 16:51:57
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
