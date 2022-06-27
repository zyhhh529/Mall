package com.yunheng.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yunheng.common.utils.PageUtils;
import com.yunheng.mall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author yunheng
 * @email yunhengz529@gmail.com
 * @date 2022-06-26 18:56:31
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

