package com.yunheng.mall.member.dao;

import com.yunheng.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yunheng
 * @email yunhengz529@gmail.com
 * @date 2022-06-26 18:21:54
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
