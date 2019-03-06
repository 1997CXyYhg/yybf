package com.yybf.yybf;

import com.github.pagehelper.PageHelper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.Properties;

/**
 * @author yhg
 *
 */
@SpringBootApplication
@MapperScan(basePackages = "com.yybf.yybf.dao")
@EnableCaching
@ComponentScan(basePackages = {"com.yybf.yybf.controller","com.yybf.yybf.dao","com.yybf.yybf.service"})
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
