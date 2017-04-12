package au.com.redballoon.api;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import au.com.redballoon.domain.TopArtistsResponse;
import au.com.redballoon.service.LastFmClient;

/**
 * Created by rodealmeida on 11/04/2017.
 */
@Path("/")
@Consumes({ "application/json" })
@Produces("application/json")
public class ArtistsService
{

    @Inject
    private LastFmClient lastFmRestClient;

    @GET
    @Path("/artists/top")
    public TopArtistsResponse getTopArtistsByCountry(@QueryParam("country") String country,
                                                     @QueryParam("pageSize") Integer pageSize,
                                                     @QueryParam("page") Integer page)
    {
        return lastFmRestClient.getArtistsByCountry(country, pageSize, page);
    }
}
