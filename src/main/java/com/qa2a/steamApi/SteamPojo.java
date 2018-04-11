package com.qa2a.steamApi;

public class SteamPojo {
    //
    private Appnews appnews;

    public Appnews getAppnews() {
        return appnews;
    }

    public void setAppnews(Appnews appnews) {
        this.appnews = appnews;
    }

    @Override
    public String toString() {
        return "ClassPojo [appnews = " + appnews + "]";
    }
}
