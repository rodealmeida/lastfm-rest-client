
package au.com.redballoon.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by rodealmeida on 11/04/2017.
 */
public class TopTracks
{

    private List<Track> track = null;
    private Attr attr;

    public List<Track> getTrack() {
        return track;
    }

    public void setTrack(List<Track> track) {
        this.track = track;
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
