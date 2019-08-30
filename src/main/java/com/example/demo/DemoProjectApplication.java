package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableSwagger2
public class DemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProjectApplication.class, args);
	}
	
	
	/*
	 * @Bean public Docket swaggerConfiguration() { return new
	 * Docket(DocumentationType.SWAGGER_2) .select()
	 * .paths(PathSelectors.ant("/api/*"))
	 * .apis(RequestHandlerSelectors.basePackage("com.example"))
	 * .build().apiInfo(apiEndPointsInfo()); } private ApiInfo apiEndPointsInfo() {
	 * return new ApiInfoBuilder().title("Spring Boot REST API")
	 * .description("Address Book Management REST API") .license("ATR com")
	 * .licenseUrl("http://www.google.com") .version("1.7.0") .build();
	 * 
	 * }
	 */

}
