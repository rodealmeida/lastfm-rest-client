package au.com.redballoon.service;

import au.com.redballoon.domain.TopArtistsResponse;
import au.com.redballoon.domain.TopTracksResponse;

/**
 * Created by rodealmeida on 11/04/17.
 */
public interface LastFmClient
{
    /**
     * Finds the top artists for a given country.
     *
     * @param country to find the top artists for.
     * @param pageSize number of items to be retrieved.
     * @param page number to fetch.
     *
     * @return the top artists found by country.
     */
    TopArtistsResponse getArtistsByCountry(String country, Integer pageSize, Integer page);

    /**
     * Finds the top songs for a given artist.
     *
     * @param artistName to find songs for.
     * @param pageSize number of items to be retrieved.
     * @param page number to fetch.
     *
     * @return the top songs found for an artist.
     */
    TopTracksResponse getTopSongByArtist(String artistName, Integer pageSize, Integer page);
}
