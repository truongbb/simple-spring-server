package com.github.truongbb.simplespringserver.response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

/**
 * @author truongbb
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PostResponse {

  String postId;

  String ownerAvatarUrl;

  String userId;

  String displayedName;

  String caption;

  List<String> fileUrls;

  Date postTime;

  String privacySetting;

  int numberOfComment;

  int numberOfLike;

  List<CommentResponseData> comments;

}
