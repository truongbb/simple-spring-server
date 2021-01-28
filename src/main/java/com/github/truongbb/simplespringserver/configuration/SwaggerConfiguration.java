package com.github.truongbb.simplespringserver.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
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
public class SwaggerConfiguration extends WebMvcConfigurationSupport {

  @Bean
  public Docket api() {
    return new Docket(DocumentationType.OAS_30)
      .select()
      .apis(RequestHandlerSelectors.any())
//      .apis(RequestHandlerSelectors.basePackage("com.github.truongbb.simplespringserver"))
      .paths(PathSelectors.any())
      .build()
      .apiInfo(apiInfo())
      .useDefaultResponseMessages(false);
  }

//  @Override
//  protected void addResourceHandlers(ResourceHandlerRegistry registry) {
//    registry.addResourceHandler("swagger-ui.html")
//      .addResourceLocations("classpath:/META-INF/resources/");
//    registry.addResourceHandler("/webjars/**")
//      .addResourceLocations("classpath:/META-INF/resources/webjars/");
//  }

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
