package com.yunheng.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yunheng.mall.product.entity.BrandEntity;
import com.yunheng.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("test description");
//        brandEntity.setName("Apple");
//        brandService.save(brandEntity);
//        System.out.println("save success!");
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",1));
        list.forEach(System.out::println);
    }

}
