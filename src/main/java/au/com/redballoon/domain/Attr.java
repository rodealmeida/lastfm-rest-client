
package au.com.redballoon.domain;

/**
 * Created by rodealmeida on 11/04/2017.
 */
public class Attr
{
    private String country;
    private String artist;
    private String page;
    private String perPage;
    private String totalPages;
    private String total;
    private String rank;

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getArtist()
    {
        return artist;
    }

    public void setArtist(String artist)
    {
        this.artist = artist;
    }

    public String getPage()
    {
        return page;
    }

    public void setPage(String page)
    {
        this.page = page;
    }

    public String getPerPage()
    {
        return perPage;
    }

    public void setPerPage(String perPage)
    {
        this.perPage = perPage;
    }

    public String getTotalPages()
    {
        return totalPages;
    }

    public void setTotalPages(String totalPages)
    {
        this.totalPages = totalPages;
    }

    public String getTotal()
    {
        return total;
    }

    public void setTotal(String total)
    {
        this.total = total;
    }

    public String getRank()
    {
        return rank;
    }

    public void setRank(String rank)
    {
        this.rank = rank;
    }
}
