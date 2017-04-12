package au.com.redballoon.service;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import au.com.redballoon.config.Property;
import au.com.redballoon.domain.TopArtistsResponse;
import au.com.redballoon.domain.TopTracksResponse;

/**
 * Created by rodealmeida on 11/04/2017.
 */
@ApplicationScoped
public class LastFmRestClient implements LastFmClient
{

    @Inject
    @Property("lastfm.api.key")
    private String apikey;

    @Inject
    @Property("lastfm.api")
    private String apiEndpoint;

    private Client client;

    private WebTarget target;

    @PostConstruct
    protected void init()
    {
        client = ClientBuilder.newClient();
        target = client.target(apiEndpoint)
                .queryParam("api_key", apikey)
                .queryParam("format", "json");
    }

    public TopArtistsResponse getArtistsByCountry(String country, Integer pageSize, Integer page)
    {
        return target.queryParam("method", "geo.gettopartists")
                .queryParam("country", country)
                .queryParam("limit", pageSize)
                .queryParam("page", page)
                .request(MediaType.APPLICATION_JSON)
                .get(TopArtistsResponse.class);
    }

    @Override
    public TopTracksResponse getTopSongByArtist(String artistName, Integer pageSize, Integer page)
    {
        return target.queryParam("method", "artist.gettoptracks")
                .queryParam("artist", artistName)
                .queryParam("limit", pageSize)
                .queryParam("page", page)
                .request(MediaType.APPLICATION_JSON)
                .get(TopTracksResponse.class);
    }
}
