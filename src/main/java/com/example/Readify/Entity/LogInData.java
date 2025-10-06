package com.example.Readify.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;



@Data
public class LogInData {
    @NotBlank(message = "User name can't be null")
    @Size(min = 3,max = 12,message = "user name must be between 3-12 character")
    private String userName;
    private String email;
}
