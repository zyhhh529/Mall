package com.yunheng.mall.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class MallThirdPartyApplicationTests {
    @Resource
    OSSClient ossClient;

    @Test
    void contextLoads() {
    }

    @Test
    public void testUpload() throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("H:\\GODKNOWS\\照片\\face detection\\1.jpg");
        ossClient.putObject("yunheng-mall","test1.jpg", inputStream);
        ossClient.shutdown();
    }
}
