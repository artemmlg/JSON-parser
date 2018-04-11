package com.qa2a.steamApi;

public class Appnews
{
    private String count;

    private Newsitems[] newsitems;

    private String appid;

    public String getCount ()
    {
        return count;
    }

    public void setCount (String count)
    {
        this.count = count;
    }

    public Newsitems[] getNewsitems ()
    {
        return newsitems;
    }

    public void setNewsitems (Newsitems[] newsitems)
    {
        this.newsitems = newsitems;
    }

    public String getAppid ()
    {
        return appid;
    }

    public void setAppid (String appid)
    {
        this.appid = appid;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [count = "+count+", newsitems = "+newsitems+", appid = "+appid+"]";
    }
}