package com.godeltech.config;

import static springfox.documentation.builders.PathSelectors.any;
import static springfox.documentation.builders.RequestHandlerSelectors.basePackage;
import static springfox.documentation.spi.DocumentationType.SWAGGER_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Lesson 4 Build Tools Runner")
                .description("Lesson 4 Build Tools Runner")
                .build();
    }

    @Bean
    public Docket api() {
        //publish to default swagger url, e.g.: http://localhost:8080/swagger-ui.html
        return new Docket(SWAGGER_2)
                .useDefaultResponseMessages(false)
                .apiInfo(apiInfo())
                .select()
                .apis(basePackage("com.godeltech"))
                .paths(any())
                .build();
    }
}
