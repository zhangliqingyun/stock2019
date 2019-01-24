package com.stock;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description 程序启动类
 * @author 张立增
 * @Date 2019年1月20日 下午4:39:59
 */
@SpringBootApplication
@ComponentScan(basePackages ={"com.stock"})
@MapperScan("com.stock.dao")
public class StartApplication {
   
	public static void main( String[] args )
    {
		 SpringApplication.run(StartApplication.class, args);
    }
}
