package com.bridgelabz;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyserFactory {

    public static RealMoodAnalyser creatMoodAnalyser(String s) {
        try {
            Class<?> moodAnalyserClass = Class.forName("com.bridgelabz.RealMoodAnalyser");
            Constructor moodConstructor = moodAnalyserClass.getConstructor(String.class);
            Object moodObj = moodConstructor.newInstance(s);
            return (RealMoodAnalyser) moodObj;
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }

}
