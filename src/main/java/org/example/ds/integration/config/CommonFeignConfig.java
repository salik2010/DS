package org.example.ds.integration.config;

import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;

public class CommonFeignConfig {

    @Bean
    public ErrorDecoder errorDecoder() {
        return new ErrorDecoder.Default();
    }
}
