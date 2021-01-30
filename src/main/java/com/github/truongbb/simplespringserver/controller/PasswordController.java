package com.github.truongbb.simplespringserver.controller;

import com.github.truongbb.simplespringserver.request.ChangePasswordRequest;
import com.github.truongbb.simplespringserver.request.ForgetPasswordRequest;
import com.github.truongbb.simplespringserver.request.ResetPasswordRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author truongbb
 */
@RestController
@RequestMapping("${spring.data.rest.base-path}/v1")
public class PasswordController {

  @PostMapping("/password-change")
  public ResponseEntity<?> passwordChange(@RequestBody @Validated ChangePasswordRequest changePasswordRequest) {
    // TODO - change password
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @PostMapping("/password-forgetting")
  public ResponseEntity<?> passwordForgetting(@RequestBody @Validated ForgetPasswordRequest forgetPasswordRequest) {
    // TODO - change password
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @PostMapping("password-reset")
  public ResponseEntity<?> passwordReset(@RequestBody @Validated ResetPasswordRequest resetPasswordRequest) {
    // TODO - change password
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

}
