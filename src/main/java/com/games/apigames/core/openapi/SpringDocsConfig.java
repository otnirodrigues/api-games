package com.games.apigames.core.openapi;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.info.Info;


@Configuration
@OpenAPIDefinition
public class SpringDocsConfig {

	@Bean
    GroupedOpenApi groupOpenApiCliente() {
        return GroupedOpenApi.builder()
                .group("SERVIÇOS")
                .packagesToScan("com.games.apigames.controller")
                .addOpenApiCustomizer(openaApi ->
                        openaApi.info(new Info()
                                .title("Serviços")
                                .description("API de serviços")))
                .build();
    }
}
