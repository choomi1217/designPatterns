package me.cho.design_patterns._1_creational_pattern._05_prototype._02_after;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("oomi");
        repository.setName("design-pattern-study");

        GithubIssue issue1 = new GithubIssue(repository);
        issue1.setId(1);
        issue1.setTitle("1주차 과제");

        String url = issue1.getUrl();
        System.out.println("1 : "+url);

        GithubIssue clone = (GithubIssue) issue1.clone();
        System.out.println("2 : " + clone.getUrl());

        System.out.printf("!=       : %b %n",clone != issue1);
        System.out.printf("equals   : %b %n", clone.equals(issue1));
        System.out.printf("getClass : %b %n", clone.getClass() == issue1.getClass());
    }

}
