
package au.com.redballoon.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by rodealmeida on 11/04/2017.
 */
public class Image
{
    private String text;
    private String size;

    @JsonProperty("#text")
    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public String getSize()
    {
        return size;
    }

    public void setSize(String size)
    {
        this.size = size;
    }

}
