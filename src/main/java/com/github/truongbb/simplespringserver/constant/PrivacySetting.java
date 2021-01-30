package com.github.truongbb.simplespringserver.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum PrivacySetting {

  PUBLIC(0, "Public"),
  FRIENDS(1, "Friends"),
  ONLY_ME(2, "Only me");

  private int privacyKey;
  private String privacyValue;

}
