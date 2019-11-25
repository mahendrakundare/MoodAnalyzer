package com.bridgelabz;

public class RealMoodAnalyser {

    public String analyseMood(String message) throws MoodAnalysiseException {
        try {
            if (message.contains("SAD"))
                return "SAD";
            else
                return "HAPPY";
        }
        catch (NullPointerException e)
        {
            throw new MoodAnalysiseException("Please enter proper mood");
        }
    }
}

