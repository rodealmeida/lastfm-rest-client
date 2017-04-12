
package au.com.redballoon.domain;


import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by rodealmeida on 11/04/2017.
 */
public class TopTracksResponse
{

    private TopTracks topTracks;

    @JsonProperty("toptracks")
    public TopTracks getTopTracks() {
        return topTracks;
    }

    public void setTopTracks(TopTracks topTracks) {
        this.topTracks = topTracks;
    }

}
