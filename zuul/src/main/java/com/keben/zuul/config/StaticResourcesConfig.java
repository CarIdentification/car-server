package com.keben.zuul.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * Created by Keben on 2019-04-15.
 */
@Configuration
public class StaticResourcesConfig extends WebMvcConfigurationSupport {


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/classified_img/path/**").addResourceLocations("D:\\");
        registry.addResourceHandler("/issue/path/**").addResourceLocations("file:/data/issue");
    }
}
