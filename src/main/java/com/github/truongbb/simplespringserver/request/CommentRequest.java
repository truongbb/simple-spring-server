package com.github.truongbb.simplespringserver.request;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author truongbb
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CommentRequest {

  @NotNull(message = "Post ID must not be null")
  @NotEmpty(message = "Post ID must not be empty")
  String postId;

  @NotNull(message = "Commenter ID must not be null")
  @NotEmpty(message = "Commenter ID must not be empty")
  String commenterId;

  MultipartFile[] multipartFiles;

  @NotNull(message = "Comment content must not be null")
  @NotEmpty(message = "Comment content must not be empty")
  String commentContent;

  @NotNull(message = "Comment time cannot be null")
  Date commentTime;

}
