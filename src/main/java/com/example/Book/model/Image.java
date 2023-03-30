package com.example.Book.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Image {
    private Integer imageId;
    private String path;
    private String type;
    private Long size;
    private String token;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
}
