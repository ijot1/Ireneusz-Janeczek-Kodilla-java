package com.kodilla.stream;


import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.person.People;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> forumUsersResultLst = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> LocalDate.now().getYear() - forumUser.getDateOfBirth().getYear() > 19)
                .filter(forumUser -> forumUser.getPostsCount() > 0)
                .collect(Collectors.toMap(forumUser -> forumUser.getUniqueId(), forumUser -> forumUser));
        System.out.println("# users: " + forumUsersResultLst.size());
            forumUsersResultLst.entrySet().stream()
                    .map(f -> f.getKey() + ": " + f.getValue())
                    .forEach(System.out::println);
    }
}


