package com.github.truongbb.simplespringserver.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

/**
 * @author truongbb
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

  // to view swagger ui: http://localhost:9870/swagger-ui/index.html

  @Bean
  public Docket api() {
    return new Docket(DocumentationType.OAS_30)
      .select()
//      .apis(RequestHandlerSelectors.any())
      .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
//      .apis(RequestHandlerSelectors.basePackage("com.github.truongbb.simplespringserver"))
      .paths(PathSelectors.any())
      .build()
      .apiInfo(apiInfo())
      .useDefaultResponseMessages(false);
  }

  private ApiInfo apiInfo() {
    return new ApiInfo(
      "Simple Spring Server API",
      "Demo API Documentation.",
      "1.0",
      "",
      new Contact("truongbb", "https://github.com/truongbb", "truongbb96@outlook.com"),
      "",
      "",
      Collections.emptyList());
  }

}
