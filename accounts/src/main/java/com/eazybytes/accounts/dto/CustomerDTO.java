package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account information"
)
public class CustomerDTO {

    @NotEmpty(message = "Name cannot be null or empty")
    @Size(min = 5, max = 30, message = "The length of customer name should be between 5 and 30")
    @Schema(
            description = "Name of the customer",
            example = "Rakesh Sharma"
    )
    private String name;

    @NotEmpty(message = "Name cannot be null or empty")
    @Email(message = "Email address should be a valid value")
    @Schema(
            description = "Email address of the customer",
            example = "xyz@c.com"
    )
    private String email;

    @Pattern(regexp = "$|[0-9]{10}", message = "Mobile Number must be 10 digits")
    @Schema(
            description =  "Mobile Address of the customer",
            example = "1234567891"
    )
    private String mobileNumber;

    @Schema(
            description = "Account Details of the Customer"
    )
    private AccountsDTO accountsDTO;

}
