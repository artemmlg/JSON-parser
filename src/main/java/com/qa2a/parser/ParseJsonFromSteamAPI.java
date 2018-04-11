package com.qa2a.parser;

import com.google.gson.Gson;
import com.qa2a.steamApi.Newsitems;
import com.qa2a.steamApi.SteamPojo;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class ParseJsonFromSteamAPI {
    private static OkHttpClient client = new OkHttpClient();
    private static Gson gson = new Gson();
    private static SteamPojo steamPojo;
    static String jsonData = "http://api.steampowered.com/ISteamNews/GetNewsForApp/v0002/?appid=440&count=3&maxlength=300&format=json";

    static {
        try {
            steamPojo = gson.fromJson(getJSON(jsonData), SteamPojo.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getJSON(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public static String getAppNewsCount() {
        return steamPojo.getAppnews().getCount();
    }

    public static String getAppID(){
        return steamPojo.getAppnews().getAppid();
    }

    public static void printNewsTitles() {
        for (Newsitems newsitems : steamPojo.getAppnews().getNewsitems()) {
            System.out.println(newsitems.getTitle());
        }
    }

    public static void printFeedLabels() {
        for (Newsitems newsitems : steamPojo.getAppnews().getNewsitems()) {
            System.out.println(newsitems.getFeedlabel());
        }
    }
}
