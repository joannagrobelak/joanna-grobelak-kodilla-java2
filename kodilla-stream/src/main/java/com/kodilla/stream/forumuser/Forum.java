package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {

        forumUserList.add(new ForumUser(1,"Winnie the Pooh", 'M', LocalDate.of(1926, 12, 10), 5670));
        forumUserList.add(new ForumUser(2, "Piglet", 'M', LocalDate.of(1998, 6, 27), 3500));
        forumUserList.add(new ForumUser(3, "Tigger", 'M', LocalDate.of(1926, 6, 26), 2788));
        forumUserList.add(new ForumUser(4, "Kanga", 'F', LocalDate.of(1928, 5, 21), 1434));
        forumUserList.add(new ForumUser(5, "Roo", 'M', LocalDate.of(1998, 6, 26), 24));
        forumUserList.add(new ForumUser(6, "Rabbit", 'M', LocalDate.of(1920, 4, 24), 4002));
        forumUserList.add(new ForumUser(7, "Eeyore", 'M', LocalDate.of(1928, 4, 20), 0));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }
}
