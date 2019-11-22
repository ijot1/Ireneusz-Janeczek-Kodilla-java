package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int uniqueId;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postsCount;

    public ForumUser(int uniqueId, String userName, char sex, LocalDate dateOfBirth, int postsCount) {
        this.uniqueId = uniqueId;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(1970, 10, 1);
        this.postsCount = postsCount;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostsCount() {
        return postsCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "uniqueId=" + uniqueId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth.toString() +
                ", postsNumber=" + postsCount +
                '}';
    }
}
