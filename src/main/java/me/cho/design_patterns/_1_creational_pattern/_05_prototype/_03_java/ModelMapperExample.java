package me.cho.design_patterns._1_creational_pattern._05_prototype._03_java;

import me.cho.design_patterns._1_creational_pattern._05_prototype._02_after.GithubIssue;
import me.cho.design_patterns._1_creational_pattern._05_prototype._02_after.GithubRepository;
import org.modelmapper.ModelMapper;

public class ModelMapperExample {

    public static void main(String[] args) {

        GithubRepository repository = new GithubRepository();
        repository.setUser("oomi");
        repository.setName("study");

        GithubIssue issue = new GithubIssue(repository);
        issue.setId(1);
        issue.setTitle("1주차");

        GithubIssueData githubIssueData = new GithubIssueData();

        ModelMapper modelMapper = new ModelMapper();
        GithubIssueData issueData = modelMapper.map(issue, GithubIssueData.class);
        System.out.println(issueData);

    }

}
