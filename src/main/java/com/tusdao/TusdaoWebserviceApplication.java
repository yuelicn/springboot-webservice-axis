package com.tusdao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author yueli
 * @date 2019-08-05 19:17
 */
@MapperScan(value = {"com.tusdao.*.dao"})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ServletComponentScan
public class TusdaoWebserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TusdaoWebserviceApplication.class, args);
    }
}