
package au.com.redballoon.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by rodealmeida on 11/04/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TopArtistsResponse
{
    private TopArtists topArtists;

    private String errorMessage;

    @JsonProperty("topartists")
    public TopArtists getTopArtists()
    {
        return topArtists;
    }

    public void setTopArtists(TopArtists topArtists)
    {
        this.topArtists = topArtists;
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
