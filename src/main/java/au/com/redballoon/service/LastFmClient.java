package au.com.redballoon.service;

import au.com.redballoon.domain.TopArtistsResponse;

/**
 * Created by rodealmeida on 11/04/17.
 */
public interface LastFmClient
{
    TopArtistsResponse getArtistsByCountry(String country, Integer pageSize, Integer page);
}
