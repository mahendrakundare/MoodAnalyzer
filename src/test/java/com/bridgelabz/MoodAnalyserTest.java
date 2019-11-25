package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.awt.peer.TextAreaPeer;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        RealMoodAnalyser analyser = new RealMoodAnalyser();
        String mood = analyser.analyseMood("This is sad message");
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy() {
        RealMoodAnalyser moodAnalyser = new RealMoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is Happy message");
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenNullShoulReturnHappy() {
        RealMoodAnalyser moodAnalyser = new RealMoodAnalyser();
        String mood = moodAnalyser.analyseMood(null);
        Assert.assertEquals("HAPPY",mood);
    }
}
