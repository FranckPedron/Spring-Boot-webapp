package com.franckycorp.webapp.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Data
@Configuration
@ConfigurationProperties(prefix = "com.franckycorp.webapp")
public class CustomProperties {

    private String apiUrl;
}
