package com.github.truongbb.simplespringserver.request;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PostRequest {

  MultipartFile[] multipartFiles;

  String caption;

  @NotNull(message = "Post time cannot be null")
  Date postTime;

  String location;

  int privacySetting;

}
