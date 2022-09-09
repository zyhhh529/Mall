package com.yunheng.mall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yunheng.common.utils.PageUtils;
import com.yunheng.common.utils.Query;
import com.yunheng.mall.product.dao.CategoryDao;
import com.yunheng.mall.product.entity.CategoryEntity;
import com.yunheng.mall.product.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

//    @Autowired
//    CategoryDao categoryDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        // 1. find all categories
        List<CategoryEntity> entities = baseMapper.selectList(null);

        // 2. Assemble into a tree structure
        List<CategoryEntity> level1 = entities.stream().filter(categoryEntity ->
                categoryEntity.getParentCid() == 0
        ).map((root) -> {
            root.setChildren(getChildren(root, entities));
            return root;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort()==null? 0:menu1.getSort()) - (menu2.getSort()==null? 0:menu2.getSort());
        }).collect(Collectors.toList());

        return level1;
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {
        // TODO 检查引用

        baseMapper.deleteBatchIds(asList);
    }

    // find sub menu recursively
    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {
        List<CategoryEntity> children = all.stream().filter(categoryEntity -> {
            return Objects.equals(categoryEntity.getParentCid(), root.getCatId());
        }).map(categoryEntity -> {
            categoryEntity.setChildren((getChildren(categoryEntity, all)));
            return categoryEntity;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort()==null? 0:menu1.getSort()) - (menu2.getSort()==null? 0:menu2.getSort());
        }).collect(Collectors.toList());
        return children;
    }

}