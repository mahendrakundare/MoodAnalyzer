package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.awt.peer.TextAreaPeer;

public class MoodAnalyserTest {
//    @Test
//    public void givenMessage_WhenSad_ShouldReturnSad() throws MoodAnalysiseException {
//        RealMoodAnalyser analyser = new RealMoodAnalyser();
//        String mood = analyser.analyseMood("This is sad message");
//        Assert.assertEquals("SAD",mood);
//    }
//
//    @Test
//    public void givenMessage_WhenNotSad_ShouldReturnHappy() throws MoodAnalysiseException {
//        RealMoodAnalyser moodAnalyser = new RealMoodAnalyser();
//        String mood = moodAnalyser.analyseMood("This is Happy message");
//        Assert.assertEquals("HAPPY", mood);
//    }
//
//    @Test
//    public void givenNull_ShoulReturnHappy() throws MoodAnalysiseException {
//        RealMoodAnalyser moodAnalyser = new RealMoodAnalyser();
//        String mood = moodAnalyser.analyseMood(null);
//        Assert.assertEquals("HAPPY",mood);
//    }
//
//    @Test
//    public void givenNull_ShoulThrowException() {
//        RealMoodAnalyser moodAnalyser = new RealMoodAnalyser();
//        try {
//            ExpectedException exceptionRule = ExpectedException.none();
//            exceptionRule.expect(MoodAnalysiseException.class);
//            moodAnalyser.analyseMood(null);
//        } catch (MoodAnalysiseException e) {
//            Assert.assertEquals("Please enter proper mood", e.getMessage());
//        }
//    }
//

    @Test
    public void givenMoodAnalyserClass_WhenProper_shouldReturnObject() {
        RealMoodAnalyser realMoodAnalyser = MoodAnalyserFactory.creatMoodAnalyser("I am in a happy mood");
        try {
            String mood = realMoodAnalyser.analyseMood();
            Assert.assertEquals("HAPPY",mood);

        } catch (MoodAnalysiseException e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void givenMessage_WhenProper_Should_Return_Object_Using_Reflector() {
        RealMoodAnalyser moodAnalyzer = new RealMoodAnalyser("I am in a happy");
        ObjectReflector.dump(moodAnalyzer, 0);
    }

    @Test
    public void givenNullMoodshouldThrowException() {
        RealMoodAnalyser realMoodAnalyser = new RealMoodAnalyser(null);
        try {
            realMoodAnalyser.analyseMood(null);
        } catch (MoodAnalysiseException e) {
            Assert.assertEquals(MoodAnalysiseException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void givenEmptyMoodshouldThrowException() {
        RealMoodAnalyser realMoodAnalyser = new RealMoodAnalyser("");
        try {
            realMoodAnalyser.analyseMood("");
        } catch (MoodAnalysiseException e) {
            Assert.assertEquals(MoodAnalysiseException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }
}
