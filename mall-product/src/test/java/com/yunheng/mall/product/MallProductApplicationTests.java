package com.yunheng.mall.product;

import com.yunheng.mall.product.entity.BrandEntity;
import com.yunheng.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("test description");
        brandEntity.setName("Apple");
        brandService.save(brandEntity);
        System.out.println("save success!");
    }

}
