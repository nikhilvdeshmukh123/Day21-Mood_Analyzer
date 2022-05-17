package com.bridgelabz;

/* @Purpose : Ability to analyse mood and respond either happy or sad
 * @Author : Nikhil Deshmukh
 */
public class MoodAnalyser {

    public String analyseMood(String msg) {
        if (msg.contains("Sad")) {
            return "Sad";
        }
        return "Happy";
    }
}