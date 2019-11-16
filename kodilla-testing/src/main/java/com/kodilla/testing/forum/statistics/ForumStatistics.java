package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private Statistics statistics;
    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double postsCountPerUser;
    private double commentsCountPerUser;
    private double commentsCountPerPost;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        setUsersCount(statistics.userNames().size());
        setPostsCount(statistics.postsCount());
        setCommentsCount(statistics.commentsCount());

        if (statistics.userNames().size() > 0) {
            setPostsCountPerUser((double) statistics.postsCount() / statistics.userNames().size());
            setCommentsCountPerUser((double) statistics.commentsCount() / statistics.userNames().size());
        } else {
            setPostsCountPerUser(0);
            setCommentsCountPerUser(0);
        }
        if (statistics.postsCount() > 0) {
            setCommentsCountPerPost((double) statistics.commentsCount() / statistics.postsCount());
        } else
            setCommentsCountPerPost(0);
    }

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getPostsCountPerUser() {
        return postsCountPerUser;
    }

    public double getCommentsCountPerUser() {
        return commentsCountPerUser;
    }

    public double getCommentsCountPerPost() {
        return commentsCountPerPost;
    }

    public void setUsersCount(int usersCount) {
        this.usersCount = usersCount;
    }

    public void setPostsCount(int postsCount) {
        this.postsCount = postsCount;
    }

    public void setCommentsCount(int commentsCount) {
        this.commentsCount = commentsCount;
    }

    public void setPostsCountPerUser(double postsCountPerUser) {
        this.postsCountPerUser = postsCountPerUser;
    }

    public void setCommentsCountPerUser(double commentsCountPerUser) {
        this.commentsCountPerUser = commentsCountPerUser;
    }

    public void setCommentsCountPerPost(double commentsCountPerPost) {
        this.commentsCountPerPost = commentsCountPerPost;
    }

    public void showStatistics() {
        System.out.println("Users count: " + getUsersCount());
        System.out.println("Posts count" + getPostsCount());
        System.out.println("Comments count: " + getCommentsCount());
        System.out.println("Posts count per user: " + getPostsCountPerUser());
        System.out.println("Comments count per user: " + getCommentsCountPerUser());
        System.out.println("Comments count per post " + getCommentsCountPerPost());
    }
}
