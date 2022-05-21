package com.nowcoder.community.community.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;
import java.text.SimpleDateFormat;

@Configuration
public class AlphaConfig {
    @Bean
    public SimpleDateFormat simpleDateFormat(){
        return new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
    }
}
