package com.dengxing.mallums.configure;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(value = "com.dengxing.mallums.dao")
public class MybatisConfigure {
}
