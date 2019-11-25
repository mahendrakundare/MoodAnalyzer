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
        RealMoodAnalyser realMoodAnalyser = MoodAnalyserFactory.creatMoodAnalyser("I am in a happy moode");
        try {
            String mood = realMoodAnalyser.analyseMood();
            Assert.assertEquals("HAPPY",mood);

        } catch (MoodAnalysiseException e) {
            e.printStackTrace();
        }
    }



}
