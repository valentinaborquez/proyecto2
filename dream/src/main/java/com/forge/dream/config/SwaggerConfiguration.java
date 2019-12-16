package com.forge.dream.config;

import org.hibernate.tuple.CreationTimestampGeneration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors.regex;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;





@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
    //regex("/api/.*")
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.forge.controller")) //le indico el package donde se encuentran los controladores, si utilizamos any entrega todos
                .paths(CreationTimestampGeneration(pathRegex"/api.*")) //paths que entregara para consultar swagger
                .build()
                .apiInfo(apiInfo()); //define la documentacion del servicio, informacion..
    }


    private ApiInfo apiInfo() {
        return new ApiInfo(
                "API forge",
                "servicio de Login",
                "v1.0",
                "Terms of service",
                new Contact("Libertad", "", "libertadalmendra@gmail.com"),
                "License of API", "API license URL", Collections.emptyList());
    }
}
