package me.cho.design_patterns._3_behavior_pattern._04_Iterator._01_before;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private final List<Post> posts = new ArrayList<>();

    public void addPost(String title) {
        posts.add(new Post(title));
    }

    public List<Post> getPosts() {
        return posts;
    }
}
