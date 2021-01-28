package com.github.truongbb.simplespringserver.request;

import com.github.truongbb.simplespringserver.validation.Gender;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRequest {

  @Size(min = 5, message = "Username length must be at least 5")
  @NotBlank(message = "Username cannot be blank")
  String username;

  @NotBlank(message = "Password cannot be blank")
  @Min(value = 6, message = "Password length must be at least 6")
  @Pattern(regexp = "[0-9a-zA-Z]+", message = "Password must be alphanumeric")
  String password;

  @NotNull(message = "Birthday cannot be null")
  Date birthday;

  @NotNull(message = "Full name cannot be null")
  @NotEmpty(message = "Full name cannot be empty")
  String fullName;

  @NotNull(message = "Email cannot be null")
  @NotEmpty(message = "Email cannot be empty")
  @Pattern(regexp = "[\\S+@\\S+\\.\\S+]+", message = "Email's invalid")
  String email;

  @Gender
  @NotNull(message = "Gender cannot be null")
  @NotEmpty(message = "Gender cannot be empty")
  String gender;

}
