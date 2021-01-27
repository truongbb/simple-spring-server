package com.github.truongbb.simplespringserver.web.resource;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author truongbb
 */
@Slf4j
@RestController
@RequestMapping("${spring.data.rest.base-path}/v1/users")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserResource {

  @GetMapping("/{username}")
  public ResponseEntity<?> getUserInfo(@PathVariable("username") String username) {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

}
