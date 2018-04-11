package com.qa2a.steamApi;

public class Newsitems
{
    private String author;

    private String title;

    private String feedname;

    private String contents;

    private String gid;

    private String appid;

    private String feed_type;

    private String date;

    private String feedlabel;

    private String url;

    private String is_external_url;

    public String getAuthor ()
    {
        return author;
    }

    public void setAuthor (String author)
    {
        this.author = author;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getFeedname ()
    {
        return feedname;
    }

    public void setFeedname (String feedname)
    {
        this.feedname = feedname;
    }

    public String getContents ()
    {
        return contents;
    }

    public void setContents (String contents)
    {
        this.contents = contents;
    }

    public String getGid ()
    {
        return gid;
    }

    public void setGid (String gid)
    {
        this.gid = gid;
    }

    public String getAppid ()
    {
        return appid;
    }

    public void setAppid (String appid)
    {
        this.appid = appid;
    }

    public String getFeed_type ()
    {
        return feed_type;
    }

    public void setFeed_type (String feed_type)
    {
        this.feed_type = feed_type;
    }

    public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }

    public String getFeedlabel ()
    {
        return feedlabel;
    }

    public void setFeedlabel (String feedlabel)
    {
        this.feedlabel = feedlabel;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    public String getIs_external_url ()
    {
        return is_external_url;
    }

    public void setIs_external_url (String is_external_url)
    {
        this.is_external_url = is_external_url;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [author = "+author+", title = "+title+", feedname = "+feedname+", contents = "+contents+", gid = "+gid+", appid = "+appid+", feed_type = "+feed_type+", date = "+date+", feedlabel = "+feedlabel+", url = "+url+", is_external_url = "+is_external_url+"]";
    }
}
