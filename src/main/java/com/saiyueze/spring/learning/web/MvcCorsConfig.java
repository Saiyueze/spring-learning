package com.saiyueze.spring.learning.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcCorsConfig implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		// "*"代表全部。"**"代表适配所有接口。 
		registry.addMapping("/**")
		.allowedOrigins("*")
		.allowCredentials(true)
		// 此处可以根据具体应用修改允许的方法
		.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
		.maxAge(3600);
	}

}
