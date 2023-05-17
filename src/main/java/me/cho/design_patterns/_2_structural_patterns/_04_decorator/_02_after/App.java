package me.cho.design_patterns._2_structural_patterns._04_decorator._02_after;

public class App {

    private static boolean enabledSpamFilter = true;
    private static boolean enabledTrimming = true;

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();

        if(enabledSpamFilter){
            commentService = new SpamFilteringCommentDecorator(commentService);
        }

        if(enabledTrimming){
            commentService = new TrimmingCommentDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("안녕");
        client.writeComment("Hi...");
        client.writeComment("https://www.naver.com/");

    }
}
