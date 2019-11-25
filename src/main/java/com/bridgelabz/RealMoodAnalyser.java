package com.bridgelabz;

public class RealMoodAnalyser {

    private String message;

    public RealMoodAnalyser(){
    }

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
                throw new MoodAnalysiseException(MoodAnalysiseException.ExceptionType.ENTERED_EMPTY, "Please enter proper mood");
            if (message.contains("SAD"))
                return "SAD";
            else
                return "HAPPY";
        }
        catch (NullPointerException e) {
            throw new MoodAnalysiseException(MoodAnalysiseException.ExceptionType.ENTERED_NULL, "Please enter proper mood");
        }
    }

    public boolean equals(Object another) {
        if (this.message.equals(((RealMoodAnalyser)another).message)) {
            return true;
        }
            return false;
    }
}

