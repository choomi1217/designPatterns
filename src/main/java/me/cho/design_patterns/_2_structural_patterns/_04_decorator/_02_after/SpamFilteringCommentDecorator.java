package me.cho.design_patterns._2_structural_patterns._04_decorator._02_after;

public class SpamFilteringCommentDecorator extends CommentDecorator{

    public SpamFilteringCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        boolean isSpam = isSpam(comment);
        if(!isSpam){
            super.addComment(comment);
        }
    }

    private boolean isSpam(String comment) {
        return comment.contains("http");
    }

}
