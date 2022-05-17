package com.bridgelabz;

/* @Purpose : Ability to analyse mood and respond either happy or sad
 * @Author : Nikhil Deshmukh
 */
public class MoodAnalyser {

    private String msg;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String msg) {
        this.msg = msg;
    }

    public String analyzeMood() {
        if (msg.contains("Sad")) {
            return "Sad";
        }
        return "Happy";
    }
}