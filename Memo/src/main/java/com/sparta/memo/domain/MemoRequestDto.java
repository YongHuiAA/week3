package com.sparta.memo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
@Getter
@NoArgsConstructor
public class MemoRequestDto {



    private String username;

    private String contents;

    private String title;
}
