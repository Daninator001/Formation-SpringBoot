
package com.linkedin.service;


import java.util.Date;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("log")
public class LogProperties {
    private Date prefix;
    private String suffix;

    public void setPrefix(Date prefix) {
        this.prefix = prefix;
    }
    public Date getPrefix() {
        return prefix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
    public String getSuffix() {
        return suffix;
    }
}
