package com.yunheng.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yunheng.common.utils.PageUtils;
import com.yunheng.mall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author yunheng
 * @email yunhengz529@gmail.com
 * @date 2022-06-26 16:51:57
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

