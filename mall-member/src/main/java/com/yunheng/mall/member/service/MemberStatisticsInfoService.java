package com.yunheng.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yunheng.common.utils.PageUtils;
import com.yunheng.mall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author yunheng
 * @email yunhengz529@gmail.com
 * @date 2022-06-26 18:21:54
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

