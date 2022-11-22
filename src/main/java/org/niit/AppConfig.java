package org.niit;

import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean("Product1")
    public Product getProduct1(){
        return new Product(100,"Product1",55.25);
    }
    @Bean("Product2")
    public Product getProduct2(){
        return new Product(101,"Product2",56.25);
    }
}
