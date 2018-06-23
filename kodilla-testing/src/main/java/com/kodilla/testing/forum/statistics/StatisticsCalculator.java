package com.kodilla.testing.forum.statistics;

import java.util.List;

public class StatisticsCalculator {

    Statistics statistics;
    int usersNumber;
    private int postsNumber;
    private int commentsNumber;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public StatisticsCalculator(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getUsersNumber() {
        return usersNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        usersNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();

        if(usersNumber == 0 || postsNumber == 0) {
            averagePostsPerUser = 0;
        } else {
            averagePostsPerUser = (double)postsNumber / usersNumber;
        }

        if(commentsNumber == 0 || usersNumber == 0) {
            averageCommentsPerUser = 0;
        } else {
            averageCommentsPerUser = (double)commentsNumber / usersNumber;
        }

        if(commentsNumber == 0 || postsNumber == 0 || usersNumber == 0) {
            averageCommentsPerPost = 0;
        } else {
            averageCommentsPerPost = (double)commentsNumber / postsNumber;
        }

    }

    public String showStatistics() {

        return "number of users of forum: " + usersNumber + "\n number of added posts: " + postsNumber +
                "\n number of added comments: " + commentsNumber + "\n average number of posts added by one user" +
                averagePostsPerUser + "\n average number of comments added by one user " + averageCommentsPerUser +
                "\n average number of comments on one post: " + averageCommentsPerPost;

    }
}
