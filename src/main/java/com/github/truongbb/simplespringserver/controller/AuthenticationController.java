package com.github.truongbb.simplespringserver.controller;

import com.github.truongbb.simplespringserver.request.AccountRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@Tag(name = "authentication", description = "the authentication API")
public class AuthenticationController {

  @Operation(operationId = "login", summary = "Login")
  @ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "Login successfully", content = @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))),
    @ApiResponse(responseCode = "401", description = "Invalid account request data (username or password)"),
    @ApiResponse(responseCode = "403", description = "Account hasn't been activated yet")
  })
  @PostMapping
  public ResponseEntity<?> login(@RequestBody @Validated AccountRequest accountRequest) {
    // TODO - do login, return jwt token
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

}
