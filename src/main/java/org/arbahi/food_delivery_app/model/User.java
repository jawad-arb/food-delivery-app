package org.arbahi.food_delivery_app.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.arbahi.food_delivery_app.enums.Role;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "please enter a first name")
    private String FirstName;
    @NotBlank(message = "please enter a last name")
    private String lastName;
    @Email(message = "please enter a valid email")
    private String email;
    @NotBlank(message = "please enter a password")
    @Size(min = 8,message = "please enter a password sup than 8 digits")
    private String password;
    private String imageUrl;
    @NotNull
    private String phoneNumber;
    @NotBlank
    private Role role;
}
