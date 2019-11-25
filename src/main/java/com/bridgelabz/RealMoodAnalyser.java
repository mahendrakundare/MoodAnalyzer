package com.bridgelabz;

public class RealMoodAnalyser {

    private String message;

    public RealMoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood(String message) throws MoodAnalysiseException{
        this.message= message;
        return analyseMood();
    }

    public String analyseMood() throws MoodAnalysiseException {
        try {
            if(message.length() == 0)
                throw new MoodAnalysiseException("Please enter proper mood");
            if (message.contains("SAD"))
                return "SAD";
            else
                return "HAPPY";
        }
        catch (NullPointerException e) {
            throw new MoodAnalysiseException("Please enter proper mood");
        }
    }
}

