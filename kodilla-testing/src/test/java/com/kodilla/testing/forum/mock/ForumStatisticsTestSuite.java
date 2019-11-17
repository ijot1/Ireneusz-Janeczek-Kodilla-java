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

        for (int i = 0; i < 45; i++) {
            listOfForumUsers.add("ForumUser" + (i + 1));
        }

        when(statisticsMock.userNames()).thenReturn(listOfForumUsers);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);

        ForumStatistics testStatisics = new ForumStatistics(statisticsMock);
        //When

        testStatisics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertTrue(testStatisics.getPostsCountPerUser()==0);
        Assert.assertEquals(testStatisics.getCommentsCountPerUser(), 0.222, 0.001);
        Assert.assertTrue(testStatisics.getCommentsCountPerPost()==0);
    }

    @Test
    public void testCalculateAdvStatisticsWithMock1() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listOfForumUsers = new ArrayList<>();

        for (int i = 0; i < 400; i++) {
            listOfForumUsers.add("ForumUser" + (i + 1));
        }

        when(statisticsMock.userNames()).thenReturn(listOfForumUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(120);

        ForumStatistics testStatistics = new ForumStatistics(statisticsMock);

        //When
        testStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(testStatistics.getPostsCountPerUser(), 2.5, 0.01);
        Assert.assertEquals(testStatistics.getCommentsCountPerUser(), 0.3, 0.01);
        Assert.assertEquals(testStatistics.getCommentsCountPerPost(), 0.12, 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsWithMock2(){
        {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            ArrayList<String> listOfForumUsers = new ArrayList<>();

            for (int i = 0; i < 90; i++) {
                listOfForumUsers.add("ForumUser" + (i + 1));
            }

            when(statisticsMock.userNames()).thenReturn(listOfForumUsers);
            when(statisticsMock.postsCount()).thenReturn(10);
            when(statisticsMock.commentsCount()).thenReturn(0);

            ForumStatistics testStatistics = new ForumStatistics(statisticsMock);

            //When
            testStatistics.calculateAdvStatistics(statisticsMock);

            //Then
            Assert.assertEquals(testStatistics.getPostsCountPerUser(), 0.11, 0.01);
            Assert.assertTrue(testStatistics.getCommentsCountPerUser() == 0);
            Assert.assertTrue(testStatistics.getCommentsCountPerPost() == 0);
        }

    }

    @Test
    public void testCalculateAdvStatisticsWithMock3() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listOfForumUsers = new ArrayList<>();

        for (int i = 0; i < 120; i++) {
            listOfForumUsers.add("ForumUser" + (i + 1));
        }

        when(statisticsMock.userNames()).thenReturn(listOfForumUsers);
        when(statisticsMock.postsCount()).thenReturn(150);
        when(statisticsMock.commentsCount()).thenReturn(100);

        ForumStatistics testStatistics = new ForumStatistics(statisticsMock);

        //When
        testStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(testStatistics.getPostsCountPerUser(), 1.25, 0.01);
        Assert.assertEquals(testStatistics.getCommentsCountPerUser(), 0.83, 0.01);
        Assert.assertEquals(testStatistics.getCommentsCountPerPost(), 0.67, 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsWithMock4(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listOfForumUsers = new ArrayList<>();

        for (int i = 0; i < 175; i++) {
            listOfForumUsers.add("ForumUser" + (i + 1));
        }

        when(statisticsMock.userNames()).thenReturn(listOfForumUsers);
        when(statisticsMock.postsCount()).thenReturn(150);
        when(statisticsMock.commentsCount()).thenReturn(180);

        ForumStatistics testStatistics = new ForumStatistics(statisticsMock);

        //When
        testStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(testStatistics.getPostsCountPerUser(), 0.86, 0.01);
        Assert.assertEquals(testStatistics.getCommentsCountPerUser(), 1.03, 0.01);
        Assert.assertEquals(testStatistics.getCommentsCountPerPost(), 1.20, 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsWithMock5(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listOfForumUsers = new ArrayList<>();

        when(statisticsMock.userNames()).thenReturn(listOfForumUsers);
        when(statisticsMock.postsCount()).thenReturn(150);
        when(statisticsMock.commentsCount()).thenReturn(180);

        ForumStatistics testStatistics = new ForumStatistics(statisticsMock);

        //When
        testStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertTrue(testStatistics.getPostsCountPerUser() == 0);
        Assert.assertTrue(testStatistics.getCommentsCountPerUser() == 0);
        Assert.assertEquals(testStatistics.getCommentsCountPerPost(), 1.20, 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsWithMock6(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> listOfForumUsers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            listOfForumUsers.add("ForumUser" + (i + 1));
        }

        when(statisticsMock.userNames()).thenReturn(listOfForumUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1800);

        ForumStatistics testStatistics = new ForumStatistics(statisticsMock);

        //When
        testStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(testStatistics.getPostsCountPerUser(), 10.00, 0.01);
        Assert.assertEquals(testStatistics.getCommentsCountPerUser(), 18.00, 0.01);
        Assert.assertEquals(testStatistics.getCommentsCountPerPost(), 1.80, 0.01);
    }
}