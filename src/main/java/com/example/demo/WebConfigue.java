package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfigue implements WebMvcConfigurer {
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/").setViewName("welcome.html");
//        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
//        super.addViewControllers(registry);
//    }

    /**
     * 拦截某个请求跳转固定位置
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("welcome");
    }
}
