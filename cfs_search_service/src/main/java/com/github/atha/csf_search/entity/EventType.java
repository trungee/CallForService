package com.github.atha.csf_search.entity;

public enum EventType {

  EventType("SMO"), PENDING("PENDING");

  private final String code;

  EventType(String code) {
    this.code = code;
  }
}
