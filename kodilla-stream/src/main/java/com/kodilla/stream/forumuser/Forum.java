package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUsers = new ArrayList<>();

    public Forum() {
        forumUsers.add(new ForumUser(1, "forumUser1", 'M', LocalDate.of(1976, 10, 23), 0));
        forumUsers.add(new ForumUser(2, "forumUser2", 'F', LocalDate.of(1996, 12, 15), 25));
        forumUsers.add(new ForumUser(3, "forumUser3", 'M', LocalDate.of(1980, 1, 16), 36));
        forumUsers.add(new ForumUser(4, "forumUser4", 'M', LocalDate.of(1990, 4, 20), 0));
        forumUsers.add(new ForumUser(5, "forumUser5", 'F', LocalDate.of(1986, 8, 5), 34));
        forumUsers.add(new ForumUser(6, "forumUser6", 'M', LocalDate.of(1967, 7, 10), 21));
        forumUsers.add(new ForumUser(7, "forumUser7", 'M', LocalDate.of(1991, 5, 29), 35));
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(forumUsers);
    }
}
