package me.cho.design_patterns._3_behavior_pattern._04_Iterator._01_before;

import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("디자인 패턴");
        board.addPost("디자인 패턴 1강을 수강하시겠습니까?");
        board.addPost("디자인 패턴의 수강을 종료합니다.");

        List<Post> posts = board.getPosts();
        for (Post post : posts) {
            System.out.println(post.getTitle());
        }

        posts.sort((p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
        for (Post post : posts) {
            System.out.println(post.getTitle() + " _" + post.getCreatedDateTime());
        }

    }
}
