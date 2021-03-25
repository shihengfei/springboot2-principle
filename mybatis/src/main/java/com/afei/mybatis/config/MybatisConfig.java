package com.afei.mybatis.config;

import com.afei.mybatis.interception.MyOnePlugin;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * mybatis 配置类
 * @author shihengfei
 */
@Configuration
public class MybatisConfig {

    @Bean
    public ConfigurationCustomizer configurationCustomizer() {
        // 添加插件-自动配置
        return configuration -> {
            configuration.addInterceptor(new MyOnePlugin());
        };
    }

}
