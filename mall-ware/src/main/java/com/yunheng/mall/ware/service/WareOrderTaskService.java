package com.yunheng.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yunheng.common.utils.PageUtils;
import com.yunheng.mall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author yunheng
 * @email yunhengz529@gmail.com
 * @date 2022-06-26 18:56:31
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

