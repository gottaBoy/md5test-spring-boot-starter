package com.gottaboy.auto;

import com.gottaboy.service.MD5Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MD5AutoConfiguration {

    @Bean
    MD5Service md5Service() {
        return new MD5Service();
    }
}
