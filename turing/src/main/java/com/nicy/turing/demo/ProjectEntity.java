package com.nicy.turing.demo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author SugarYe
 * @date 2020年06月29日 11:34
 */
@Data
@Component
@ConfigurationProperties(prefix="project")
@PropertySource("classpath:application-dev.properties")
public class ProjectEntity {
    private String name;
    private String version;
}
