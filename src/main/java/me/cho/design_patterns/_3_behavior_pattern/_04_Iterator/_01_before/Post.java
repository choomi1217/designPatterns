package me.cho.design_patterns._3_behavior_pattern._04_Iterator._01_before;

import lombok.Getter;

import java.util.Date;

@Getter
public class Post {
    private final String title;
    private final Date createdDateTime;

    public Post(String title) {
        this.title = title;
        this.createdDateTime = new Date();
    }
}
