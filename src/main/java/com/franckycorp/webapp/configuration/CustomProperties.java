package com.franckycorp.webapp.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Data
@Configuration
@PropertySource("classpath:application.properties")
@ConfigurationProperties(prefix = "com.franckycorp.webapp")
public class CustomProperties {

    private String apiUrl;
}
