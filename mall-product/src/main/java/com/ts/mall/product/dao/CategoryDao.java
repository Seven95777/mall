package com.ts.mall.product.dao;

import com.ts.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author pengxj
 * @email 271501722@gmail.com
 * @date 2020-04-19 13:23:56
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
