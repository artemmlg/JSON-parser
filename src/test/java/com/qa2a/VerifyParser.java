package com.qa2a;

import com.qa2a.parser.ParseJsonFromSteamAPI;
import org.testng.annotations.Test;

public class VerifyParser {

    @Test
    public void printNewsTitles(){
        ParseJsonFromSteamAPI.printNewsTitles();
    }

    @Test
    public void printFeedLabels(){
        ParseJsonFromSteamAPI.printFeedLabels();
    }

    @Test
    public void printAppID(){
        System.out.println(ParseJsonFromSteamAPI.getAppID());
    }

    @Test
    public void printAppNewsCount(){
        System.out.println(ParseJsonFromSteamAPI.getAppNewsCount());
    }
}
