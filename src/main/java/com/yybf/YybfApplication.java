package com.yybf;

import com.github.pagehelper.PageHelper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Properties;

/**
 * @author yhg
 *
 */
@SpringBootApplication
@MapperScan(basePackages = "com.yybf.mapper")
@EnableCaching
@ComponentScan(basePackages = {"com.yybf.controller","com.yybf.mapper","com.yybf.service"})
public class YybfApplication {

    public static void main(String[] args) {
        SpringApplication.run(YybfApplication.class, args);

    }


    @Bean
    public PageHelper pageHelper(){
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum", "true");
        properties.setProperty("rowBoundsWithCount", "true");
        properties.setProperty("reasonable", "true");
        properties.setProperty("dialect", "mysql");
        pageHelper.setProperties(properties);
        return pageHelper;
    }

}
