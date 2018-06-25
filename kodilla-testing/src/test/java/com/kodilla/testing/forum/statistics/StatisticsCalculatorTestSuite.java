package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Preparing to start tests...");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("test " + testCounter + " in progress...");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests executed.");
    }

    @Test
    public void testCalculateAdvStatisticsCase1NoPostsExisting() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        ArrayList<String> testList = new ArrayList<>();
        testList.add("Lisa");
        testList.add("Anna");
        testList.add("Britta");
        testList.add("Lasse");
        testList.add("Bosse");
        testList.add("Olle");

        when(statisticsMock.usersNames()).thenReturn(testList);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        double averagePostsPerUserCaseNoPosts = statisticsCalculator.getAveragePostsPerUser();
        double averageCommentsPerUserCaseNoPosts = statisticsCalculator.getAverageCommentsPerUser();
        double averageCommentsPerPostCaseNoPosts = statisticsCalculator.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(0, averagePostsPerUserCaseNoPosts, 0);
        Assert.assertEquals(0, averageCommentsPerUserCaseNoPosts, 0);
        Assert.assertEquals(0, averageCommentsPerPostCaseNoPosts, 0);

    }

    @Test
    public void testCalculateAdvStatisticsCase2ThousandPosts() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        ArrayList<String> testList = new ArrayList<>();
        testList.add("Lisa");
        testList.add("Anna");
        testList.add("Britta");
        testList.add("Lasse");
        testList.add("Bosse");
        testList.add("Olle");

        when(statisticsMock.usersNames()).thenReturn(testList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(20);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        double averagePostsPerUserCaseThousandPosts = statisticsCalculator.getAveragePostsPerUser();
        double averageCommentsPerUserCaseThousandPosts = statisticsCalculator.getAverageCommentsPerUser();
        double averageCommentsPerPostCaseThousandPosts = statisticsCalculator.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals((double)1000 / 6, averagePostsPerUserCaseThousandPosts, 0);
        Assert.assertEquals((double)20 / 6, averageCommentsPerUserCaseThousandPosts, 0);
        Assert.assertEquals((double)20 / 1000, averageCommentsPerPostCaseThousandPosts, 0);
    }

    @Test
    public void testCalculateAdvStatisticsCase3NoCommentsExisting() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        ArrayList<String> testList = new ArrayList<>();
        testList.add("Lisa");
        testList.add("Anna");
        testList.add("Britta");
        testList.add("Lasse");
        testList.add("Bosse");
        testList.add("Olle");

        when(statisticsMock.usersNames()).thenReturn(testList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        double averagePostsPerUserCaseNoComments = statisticsCalculator.getAveragePostsPerUser();
        double averageCommentsPerUserCaseNoComments = statisticsCalculator.getAverageCommentsPerUser();
        double averageCommentsPerPostCaseNoComments = statisticsCalculator.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals((double)1000 / 6, averagePostsPerUserCaseNoComments, 0);
        Assert.assertEquals(0, averageCommentsPerUserCaseNoComments, 0);
        Assert.assertEquals(0, averageCommentsPerPostCaseNoComments, 0);
    }

    @Test
    public void testCalculateAdvStatisticsCase4LessCommentsThanPosts() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        ArrayList<String> testList = new ArrayList<>();
        testList.add("Lisa");
        testList.add("Anna");
        testList.add("Britta");
        testList.add("Lasse");
        testList.add("Bosse");
        testList.add("Olle");

        when(statisticsMock.usersNames()).thenReturn(testList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(50);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        double averagePostsPerUserCaseLessCommentsThanPosts = statisticsCalculator.getAveragePostsPerUser();
        double averageCommentsPerUserCaseLessCommentsThanPosts = statisticsCalculator.getAverageCommentsPerUser();
        double averageCommentsPerPostCaseLessCommentsThanPosts = statisticsCalculator.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals((double)1000 / 6, averagePostsPerUserCaseLessCommentsThanPosts, 0);
        Assert.assertEquals((double)50 / 6, averageCommentsPerUserCaseLessCommentsThanPosts, 0);
        Assert.assertEquals((double)50 / 1000, averageCommentsPerPostCaseLessCommentsThanPosts, 0);
    }

    @Test
    public void testCalculateAdvStatisticsCase5MoreCommentsThanPosts() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        ArrayList<String> testList = new ArrayList<>();
        testList.add("Lisa");
        testList.add("Anna");
        testList.add("Britta");
        testList.add("Lasse");
        testList.add("Bosse");
        testList.add("Olle");

        when(statisticsMock.usersNames()).thenReturn(testList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(5000);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        double averagePostsPerUserCaseMoreCommentsThanPosts = statisticsCalculator.getAveragePostsPerUser();
        double averageCommentsPerUserCaseMoreCommentsThanPosts = statisticsCalculator.getAverageCommentsPerUser();
        double averageCommentsPerPostCaseMoreCommentsThanPosts = statisticsCalculator.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals((double)1000 / 6, averagePostsPerUserCaseMoreCommentsThanPosts, 0);
        Assert.assertEquals((double)5000 / 6, averageCommentsPerUserCaseMoreCommentsThanPosts, 0);
        Assert.assertEquals((double)5000 / 1000, averageCommentsPerPostCaseMoreCommentsThanPosts, 0);
    }

    @Test
    public void testCalculateAdvStatisticsCase6NoUsersExisting() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        ArrayList<String> testList = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(testList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(50);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        double averagePostsPerUserCaseNoUsers = statisticsCalculator.getAveragePostsPerUser();
        double averageCommentsPerUserCaseNoUsers = statisticsCalculator.getAverageCommentsPerUser();
        double averageCommentsPerPostCaseNoUsers = statisticsCalculator.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals(0, averagePostsPerUserCaseNoUsers, 0);
        Assert.assertEquals(0, averageCommentsPerUserCaseNoUsers, 0);
        Assert.assertEquals(0, averageCommentsPerPostCaseNoUsers, 0);
    }

    @Test
    public void testCalculateAdvStatisticsCase7HundredUsers() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        ArrayList<String> testList = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            testList.add("Lisa");
        }

        when(statisticsMock.usersNames()).thenReturn(testList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(50);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        double averagePostsPerUserCaseHundredUsers = statisticsCalculator.getAveragePostsPerUser();
        double averageCommentsPerUserCaseHundredUsers = statisticsCalculator.getAverageCommentsPerUser();
        double averageCommentsPerPostCaseHundredUsers = statisticsCalculator.getAverageCommentsPerPost();

        //Then
        Assert.assertEquals((double)1000 / 100, averagePostsPerUserCaseHundredUsers, 0);
        Assert.assertEquals((double)50 / 100, averageCommentsPerUserCaseHundredUsers, 0);
        Assert.assertEquals((double)50 / 1000, averageCommentsPerPostCaseHundredUsers, 0);
    }

}
