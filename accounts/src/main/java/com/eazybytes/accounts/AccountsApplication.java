package com.eazybytes.accounts;

import com.eazybytes.accounts.audit.AuditAwareImpl;
import com.eazybytes.accounts.dto.AccountsContactsInfoDTO;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.eazybytes.accounts.controller") })
@EnableJpaRepositories("com.eazybytes.accounts.repository")
@EntityScan("com.eazybytes.accounts.model")*/
@EnableConfigurationProperties(value = {AccountsContactsInfoDTO.class})
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
        info = @Info(
                title = "Accounts Microservice REST API Documentation",
                description = "EazyBank Accounts Microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Madan Ready",
                        email = "tutor@eas.com",
                        url = "xyz.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "xyz.com"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "EazyBank Accounts Microservice REST API Documentation",
                url = "xyz.com"
        )
)
public class AccountsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountsApplication.class, args);
    }

}
