package me.cho.design_patterns._2_structural_patterns._04_decorator._02_after;

public class CommentDecorator implements CommentService{

    CommentService commentService;

    public CommentDecorator(CommentService commentService) {
        this.commentService = commentService;
    }

    @Override
    public void addComment(String comment) {
        commentService.addComment(comment);
    }
}
