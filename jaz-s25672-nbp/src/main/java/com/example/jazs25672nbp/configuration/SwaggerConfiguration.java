package com.example.jazs25672nbp.configuration;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public OpenAPI OpenAPI() {
        Contact contact = new Contact();
        contact.setEmail("s255672@pjwstk.edu.pl");

        Info info = new Info()
                .title("NBP Service")
                .version("6.6")
                .contact(contact)
                .description("NBP currency rate");

        return new OpenAPI().info(info);
    }
}
