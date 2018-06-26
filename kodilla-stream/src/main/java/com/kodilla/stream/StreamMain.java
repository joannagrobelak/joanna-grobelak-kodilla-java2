package com.kodilla.stream;

import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.forumuser.Forum;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum forum = new Forum();
        Map<Integer, ForumUser> resultMapOfUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().isBefore(LocalDate.of(1998, 6,26)))
                .filter(forumUser -> forumUser.getPostsNumber() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        System.out.println("Number of users after filtration: " + resultMapOfUsers.size());
        System.out.println("List of users after filtration: ");
        resultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
