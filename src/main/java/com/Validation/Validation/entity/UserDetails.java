package com.Validation.Validation.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="validation_table")
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "First name is required")
    @Size(min=3, message = "Must be at least 4 characters")
    @Pattern(regexp = "^[^\\d].*",message = "name can't start with numerical digit")
    private String firstName;

    @NotBlank(message = "First name is required")
    @Pattern(regexp = "^[^\\d].*",message = "name can't contain digit")
    private String lastName;

    @Email
    @NotBlank(message = "First name is required")
    private String email;

    @NotBlank
    @Pattern(regexp = "^[6-9][0-9]{9}$", message = "wrong mobile number")
    private String mobile;

    @NotBlank
    private String address;
}
