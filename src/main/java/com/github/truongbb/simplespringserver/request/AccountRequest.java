package com.github.truongbb.simplespringserver.request;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AccountRequest {

  @Size(min = 5, message = "Username length must be at least 5")
  @NotBlank(message = "Username cannot be blank")
  String username;

  @NotBlank(message = "Password cannot be blank")
  @Min(value = 6, message = "Password length must be at least 6")
  @Pattern(regexp = "[0-9a-zA-Z]+", message = "Password must be alphanumeric")
  String password;

}
