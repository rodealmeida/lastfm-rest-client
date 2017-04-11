
package au.com.redballoon.domain;

import java.util.List;

/**
 * Created by rodealmeida on 11/04/2017.
 */
public class Artist
{
    private String name;
    private String listeners;
    private String mbid;
    private String url;
    private String streamable;
    private List<Image> image = null;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getListeners()
    {
        return listeners;
    }

    public void setListeners(String listeners)
    {
        this.listeners = listeners;
    }

    public String getMbid()
    {
        return mbid;
    }

    public void setMbid(String mbid)
    {
        this.mbid = mbid;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getStreamable()
    {
        return streamable;
    }

    public void setStreamable(String streamable)
    {
        this.streamable = streamable;
    }

    public List<Image> getImage()
    {
        return image;
    }

    public void setImage(List<Image> image)
    {
        this.image = image;
    }

}
