package com.briup.apps.briupej.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.briup.apps.briupej.mapper")
public class MybatisConfig {

}
