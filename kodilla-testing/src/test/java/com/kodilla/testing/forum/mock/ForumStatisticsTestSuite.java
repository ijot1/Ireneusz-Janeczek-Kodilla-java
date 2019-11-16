package com.kodilla.testing.forum.mock;

import com.kodilla.testing.forum.statistics.ForumStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.*;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    @Test
    public void testCalculateAdvStatisticsWithMock() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listOfForumUsers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            listOfForumUsers.add("ForumUser" + (i + 1));
        }

        when(statisticsMock.userNames()).thenReturn(listOfForumUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1200);

        ForumStatistics testStatisics = new ForumStatistics(statisticsMock);
        //When

        testStatisics.calculateAdvStatistics(statisticsMock);
        //Then

        Assert.assertEquals(testStatisics.getPostsCountPerUser(), 10, 0.01);
        Assert.assertEquals(testStatisics.getCommentsCountPerUser(), 12, 0.01);
        Assert.assertEquals(testStatisics.getCommentsCountPerPost(), 1.2, 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsWithMock1(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listOfForumUsers = new ArrayList<>();

        for (int i = 0; i < 153; i++) {
            listOfForumUsers.add("ForumUser" + (i + 1));
        }

        when(statisticsMock.userNames()).thenReturn(listOfForumUsers);
        when(statisticsMock.postsCount()).thenReturn(1115);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        ForumStatistics testStatistics = new ForumStatistics(statisticsMock);

        //When

        testStatistics.calculateAdvStatistics(statisticsMock);

        //Then

        Assert.assertEquals(testStatistics.getPostsCountPerUser(), 7.29, 0.01);
        Assert.assertEquals(testStatistics.getCommentsCountPerUser(), 6.54, 0.01);
        Assert.assertEquals(testStatistics.getCommentsCountPerPost(), 0.90, 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsWithMock2(){
        //Given

        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listOfForumUsers = new ArrayList<>();

        when(statisticsMock.userNames()).thenReturn(listOfForumUsers);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics testStatistics = new ForumStatistics(statisticsMock);

        //When

        testStatistics.calculateAdvStatistics(statisticsMock);

        //Then

        Assert.assertEquals(testStatistics.getPostsCountPerUser(), 0, 0.01);
        Assert.assertEquals(testStatistics.getCommentsCountPerUser(), 0, 0.01);
        Assert.assertEquals(testStatistics.getCommentsCountPerPost(), 0, 0.01);
    }
}