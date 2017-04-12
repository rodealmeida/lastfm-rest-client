
package au.com.redballoon.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by rodealmeida on 11/04/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TopTracksResponse
{

    private TopTracks topTracks;

    private String errorMessage;

    @JsonProperty("toptracks")
    public TopTracks getTopTracks() {
        return topTracks;
    }

    public void setTopTracks(TopTracks topTracks) {
        this.topTracks = topTracks;
    }

    @JsonProperty("errorMessage")
    public String getErrorMessage()
    {
        return errorMessage;
    }

    @JsonProperty("message")
    public void setErrorMessage(String errorMessage)
    {
        this.errorMessage = errorMessage;
    }

}
