package com.yunheng.mall.product.dao;

import com.yunheng.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yunheng
 * @email yunhengz529@gmail.com
 * @date 2022-06-26 12:05:02
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
