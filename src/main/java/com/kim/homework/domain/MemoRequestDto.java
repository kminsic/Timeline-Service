package com.kim.homework.domain;

import lombok.Getter;

@Getter
public class MemoRequestDto {
    private String username;
    private String title;
    private String contents;
    private String password;
    private String repassword;

}
