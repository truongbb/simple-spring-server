package com.github.truongbb.simplespringserver.controller;

import com.github.truongbb.simplespringserver.request.CommentRequest;
import com.github.truongbb.simplespringserver.response.CommentResponse;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/${spring.data.rest.base-path}/v1/comments")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CommentController {

  @GetMapping("/{post-id}")
  public ResponseEntity<CommentResponse> getCommentList(@PathVariable("post-id") String postId) {
    // TODO - get comment list of a post
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<?> commentPost(@ModelAttribute @Validated CommentRequest commentRequest) {
    // TODO - comment a post
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @PutMapping("/{post-id}")
  public ResponseEntity<?> commentPost(@PathVariable("post-id") String postId, @ModelAttribute CommentRequest commentRequest) {
    // TODO - edit a comment
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @DeleteMapping("/post-id")
  public ResponseEntity<?> deleteComment(@PathVariable("post-id") String postId) {
    // TODO - delete a comment
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

}
