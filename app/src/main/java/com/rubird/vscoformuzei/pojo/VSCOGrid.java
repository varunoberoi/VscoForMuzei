
package com.rubird.vscoformuzei.pojo;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class VSCOGrid {

    @Expose
    private List<Medium> media = new ArrayList<Medium>();
    @Expose
    private long page;
    @Expose
    private long size;
    @Expose
    private long total;

    /**
     * 
     * @return
     *     The media
     */
    public List<Medium> getMedia() {
        return media;
    }

    /**
     * 
     * @param media
     *     The media
     */
    public void setMedia(List<Medium> media) {
        this.media = media;
    }

    /**
     * 
     * @return
     *     The page
     */
    public long getPage() {
        return page;
    }

    /**
     * 
     * @param page
     *     The page
     */
    public void setPage(long page) {
        this.page = page;
    }

    /**
     * 
     * @return
     *     The size
     */
    public long getSize() {
        return size;
    }

    /**
     * 
     * @param size
     *     The size
     */
    public void setSize(long size) {
        this.size = size;
    }

    /**
     * 
     * @return
     *     The total
     */
    public long getTotal() {
        return total;
    }

    /**
     * 
     * @param total
     *     The total
     */
    public void setTotal(long total) {
        this.total = total;
    }

}
