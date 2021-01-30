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
public class CommentResponseData {

  String commentId;

  String userId;

  String displayedName;

  String ownerAvatarUrl;

  String commentContent;

  Date commentTime;

  List<String> fileUrls;

}
