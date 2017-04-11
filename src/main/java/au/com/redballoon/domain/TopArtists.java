
package au.com.redballoon.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by rodealmeida on 11/04/2017.
 */
public class TopArtists
{
    private List<Artist> artist = null;
    private Attr attr;

    public List<Artist> getArtist()
    {
        return artist;
    }

    public void setArtist(List<Artist> artist)
    {
        this.artist = artist;
    }

    @JsonProperty("@attr")
    public Attr getAttr()
    {
        return attr;
    }

    public void setAttr(Attr attr)
    {
        this.attr = attr;
    }

}
