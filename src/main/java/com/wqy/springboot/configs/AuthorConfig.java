package com.wqy.springboot.configs;

import com.wqy.springboot.propertityBeans.AuthorProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = {AuthorProperties.class})
public class AuthorConfig {
}
