package com.yunheng.mall.coupon.dao;

import com.yunheng.mall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author yunheng
 * @email yunhengz529@gmail.com
 * @date 2022-06-26 16:51:57
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
