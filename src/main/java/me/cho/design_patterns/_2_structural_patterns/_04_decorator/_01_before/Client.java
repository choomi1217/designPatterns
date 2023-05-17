package me.cho.design_patterns._2_structural_patterns._04_decorator._01_before;

public class Client {

    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    private void writeComment(String comment){
        commentService.addComment(comment);
    }

    public static void main(String[] args) {
        Client client = new Client(new TrimmingCommentService());
        client.writeComment("안녕");
        client.writeComment("Hi...");
        client.writeComment("https://www.naver.com/");
    }

}
