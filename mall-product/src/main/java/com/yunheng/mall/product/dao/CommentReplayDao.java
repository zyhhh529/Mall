package com.yunheng.mall.product.dao;

import com.yunheng.mall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author yunheng
 * @email yunhengz529@gmail.com
 * @date 2022-06-26 12:05:02
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
