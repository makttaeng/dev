package com.dev.devProject.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("개발실험실 API")
                        .description("각종 웹 프로그래밍 서비스를 테스트하는 목적!")
                        .version("1.0.0"));
    }
}