package com.afei.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 自定义配置类
 * @author shihengfei
 */
@ConfigurationProperties("hello")
public class HelloProperties {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
