package com.hong.trading.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:env/env.properties")
public class PropertyConfig {
}