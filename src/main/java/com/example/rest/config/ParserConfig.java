package com.example.rest.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "parser.config")
@Configuration
public class ParserConfig {
    private String link;

    public ParserConfig() {
        System.out.println("ParserConfig object created");
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
