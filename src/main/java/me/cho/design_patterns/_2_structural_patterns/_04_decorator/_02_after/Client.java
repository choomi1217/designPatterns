package me.cho.design_patterns._2_structural_patterns._04_decorator._02_after;


public class Client {

    CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    public void writeComment(String comment){
        commentService.addComment(comment);
    }

}
