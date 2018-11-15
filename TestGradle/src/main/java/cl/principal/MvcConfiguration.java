/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.principal;

/**
 *
 * @author Martin
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
 
@Configuration
@ComponentScan(basePackages="cl.spring")
@EnableWebMvc
public class MvcConfiguration implements WebMvcConfigurer {
 
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //mapping '/' to index view name without a controller
        ViewControllerRegistration r = registry.addViewController("/");
        r.setViewName("welcome");
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/jsp/", ".jsp");//default prefix=/WEB-INF/", suffix=".jsp"
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //specifying static resource location for themes related files(css etc)
        registry.addResourceHandler("/themes/**")
                .addResourceLocations("/app-themes/");
    }
}