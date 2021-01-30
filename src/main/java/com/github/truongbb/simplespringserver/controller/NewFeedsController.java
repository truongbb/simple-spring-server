package com.github.truongbb.simplespringserver.controller;

import com.github.truongbb.simplespringserver.request.PostRequest;
import com.github.truongbb.simplespringserver.response.NewFeedsResponse;
import com.github.truongbb.simplespringserver.response.PostResponse;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("${spring.data.rest.base-path}/v1/new-feeds")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class NewFeedsController {

  @PostMapping
  public ResponseEntity<?> createPost(@ModelAttribute @Validated PostRequest postRequest) {
    // TODO - create post
    return new ResponseEntity<>(null, HttpStatus.CREATED);
  }

  @GetMapping
  public ResponseEntity<List<NewFeedsResponse>> newFeeds() {
    // TODO - new feeds
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @GetMapping("/{post-id}")
  public ResponseEntity<PostResponse> getPostDetail(@PathVariable("post-id") String postId) {
    // TODO - get post detail
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @PutMapping("/{post-id}")
  public ResponseEntity<?> editPost(@PathVariable("post-id") String postId, @ModelAttribute PostRequest postRequest) {
    // TODO - edit post
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

  @DeleteMapping("/{post-id}")
  public ResponseEntity<?> deletePost(@PathVariable("post-id") String postId) {
    // TODO - delete post
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

}
