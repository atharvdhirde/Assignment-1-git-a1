package com.washerdetails.Configuration;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select().paths(PathSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.washerdetails"))
                .build()
                .apiInfo(apiDetails());
    }
    private ApiInfo apiDetails() {
		return new ApiInfo(
				"Address book API for Washer-Details", 
				"<h1>This is sample documentation for the Washer-Details App<h1>", 
				"1.0", 
				"Free to use",
				new springfox.documentation.service.Contact("Atharv Dhirde", "http://localhost:4200","atharvdhirde@gmail.com"),
				"API License", 
				"http://localhost:4200", 
				Collections.emptyList());

	}

}