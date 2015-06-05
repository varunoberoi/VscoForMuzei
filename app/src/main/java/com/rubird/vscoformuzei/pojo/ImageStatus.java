
package com.rubird.vscoformuzei.pojo;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("org.jsonschema2pojo")
public class ImageStatus {

    @Expose
    private long code;
    @Expose
    private long time;

    /**
     * 
     * @return
     *     The code
     */
    public long getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The code
     */
    public void setCode(long code) {
        this.code = code;
    }

    /**
     * 
     * @return
     *     The time
     */
    public long getTime() {
        return time;
    }

    /**
     * 
     * @param time
     *     The time
     */
    public void setTime(long time) {
        this.time = time;
    }

}
