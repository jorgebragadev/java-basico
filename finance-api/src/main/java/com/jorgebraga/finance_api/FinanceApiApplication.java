package com.jorgebraga.finance_api;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Finance API", version = "1.0", description = "API for managing personal finances"))
public class FinanceApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinanceApiApplication.class, args);
    }
}

