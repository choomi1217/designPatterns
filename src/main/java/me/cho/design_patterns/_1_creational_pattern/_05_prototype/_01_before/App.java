package me.cho.design_patterns._1_creational_pattern._05_prototype._01_before;

public class App {

    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("oomi");
        repository.setName("design-pattern-study");

        GithubIssue issue1 = new GithubIssue(repository);
        issue1.setId(1);
        issue1.setTitle("1주차 과제");

        String url = issue1.getUrl();
        System.out.println("1 : "+url);

        GithubIssue issue2 = new GithubIssue(repository);
        issue2.setId(2);
        issue2.setTitle("2주차 과제");

        url = issue2.getUrl();
        System.out.println("2 : " + url);

    }

}
