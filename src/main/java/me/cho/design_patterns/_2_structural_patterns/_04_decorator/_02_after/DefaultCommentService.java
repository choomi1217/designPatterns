package me.cho.design_patterns._2_structural_patterns._04_decorator._02_after;

public class DefaultCommentService implements CommentService{
    @Override
    public void addComment(String comment) {
        System.out.println(comment);
    }
}
