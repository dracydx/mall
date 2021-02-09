package com.dengxing.mallums.configure;


import com.dengxing.mallcommon.config.BaseSwaggerConfig;
import com.dengxing.mallcommon.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Configure extends BaseSwaggerConfig {
    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.dengxing.mallums.controller")
                .title("mall后台系统")
                .description("mall后台相关接口文档")
                .contactName("名字没想好\", \"http://baidu.com\", \"374294495@qq.com")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
