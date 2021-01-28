package com.github.truongbb.simplespringserver.controller;

import com.github.truongbb.simplespringserver.request.AccountRequest;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@RestController
@RequestMapping("${spring.data.rest.base-path}/v1/authentication")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AuthenticationResource {

  @PostMapping
  public ResponseEntity<?> login(@RequestBody @Validated AccountRequest accountRequest) {
    // TODO - do login, return jwt token
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

}
