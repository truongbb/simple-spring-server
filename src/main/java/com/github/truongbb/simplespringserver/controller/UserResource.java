package com.github.truongbb.simplespringserver.controller;

import com.github.truongbb.simplespringserver.request.UserRequest;
import com.github.truongbb.simplespringserver.response.UserResponse;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author truongbb
 */
@Slf4j
@RestController
@RequestMapping("${spring.data.rest.base-path}/v1/users")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserResource {

  @PostMapping
  public ResponseEntity<?> register(@RequestBody @Validated UserRequest userRequest) {
    // TODO - register: send activation email
//    HttpHeaders textPlainHeaders = new HttpHeaders();
//    textPlainHeaders.setContentType(MediaType.TEXT_PLAIN);
//
//    return userService.findByUsernameOrEmailOrPhone("email", userVm.getEmail())
//      .map(user -> new ResponseEntity("Email already use", textPlainHeaders, HttpStatus.BAD_REQUEST))
//      .orElseGet(() -> userService.findByUsernameOrEmailOrPhone("username", userVm.getUsername())
//        .map(user -> new ResponseEntity("Username already use", textPlainHeaders, HttpStatus.BAD_REQUEST))
//        .orElseGet(() -> userService.findByUsernameOrEmailOrPhone("phone", userVm.getPhoneNumber())
//          .map(user -> new ResponseEntity("Phone number already use", textPlainHeaders, HttpStatus.BAD_REQUEST))
//          .orElseGet(() -> {
//            UsersEntity user = userService.createUser(userVm);
//            log.debug("Created user: " + user);
//            mailService.sendActivationEmail(user.getPerson().getEmail(), user.getUsername(), user.getActiveToken());
//            return new ResponseEntity<>(HttpStatus.CREATED);
//          })
//        ));
    return new ResponseEntity<>(HttpStatus.CREATED);
  }

  @GetMapping
  public ResponseEntity<List<UserResponse>> getListUserInfo() {
    // TODO - get list user info
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @GetMapping("/{username}")
  public ResponseEntity<UserResponse> getUserInfo(@PathVariable("username") String username) {
    // TODO - detect user_id from token and do search user by username
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @PutMapping("/{username}")
  public ResponseEntity<?> updateUserInfo(@RequestBody UserRequest userRequest) {
    // TODO - update user
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @PatchMapping("/username")
  public ResponseEntity<?> updateSingleUserInfo(@RequestBody UserRequest userRequest) {
    // TODO - update user
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

}
