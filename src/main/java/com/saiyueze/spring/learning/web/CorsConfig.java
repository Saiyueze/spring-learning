package com.saiyueze.spring.learning.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

	@Bean
	public CorsFilter corsFilter() {		
		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfig());
		return new CorsFilter(urlBasedCorsConfigurationSource);
	}
	
	private CorsConfiguration corsConfig() {
	    CorsConfiguration corsConfiguration = new CorsConfiguration();
	    // 请求常用的三种配置，*代表允许全部，当时你也可以自定义属性（比如header只能带什么，只能是post方式等等
	    corsConfiguration.addAllowedOrigin("*");
	    corsConfiguration.addAllowedHeader("*");
	    corsConfiguration.addAllowedMethod("*");
	    corsConfiguration.setAllowCredentials(true);
	    corsConfiguration.setMaxAge(3600L);
	    return corsConfiguration;
	}

}
