
package com.rubird.vscoformuzei.pojo;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ImageMeta {

    @Expose
    private float aperture;
    @SerializedName("shutter_speed")
    @Expose
    private String shutterSpeed;
    @Expose
    private long iso;
    @SerializedName("flash_mode")
    @Expose
    private String flashMode;
    @SerializedName("white_balance")
    @Expose
    private String whiteBalance;
    @Expose
    private String make;
    @Expose
    private String model;
    @Expose
    private String copyright;
    @SerializedName("edit_stack")
    @Expose
    private EditStack editStack;
    @Expose
    private Collection collection;

    /**
     * 
     * @return
     *     The aperture
     */
    public float getAperture() {
        return aperture;
    }

    /**
     * 
     * @param aperture
     *     The aperture
     */
    public void setAperture(float aperture) {
        this.aperture = aperture;
    }

    /**
     * 
     * @return
     *     The shutterSpeed
     */
    public String getShutterSpeed() {
        return shutterSpeed;
    }

    /**
     * 
     * @param shutterSpeed
     *     The shutter_speed
     */
    public void setShutterSpeed(String shutterSpeed) {
        this.shutterSpeed = shutterSpeed;
    }

    /**
     * 
     * @return
     *     The iso
     */
    public long getIso() {
        return iso;
    }

    /**
     * 
     * @param iso
     *     The iso
     */
    public void setIso(long iso) {
        this.iso = iso;
    }

    /**
     * 
     * @return
     *     The flashMode
     */
    public String getFlashMode() {
        return flashMode;
    }

    /**
     * 
     * @param flashMode
     *     The flash_mode
     */
    public void setFlashMode(String flashMode) {
        this.flashMode = flashMode;
    }

    /**
     * 
     * @return
     *     The whiteBalance
     */
    public String getWhiteBalance() {
        return whiteBalance;
    }

    /**
     * 
     * @param whiteBalance
     *     The white_balance
     */
    public void setWhiteBalance(String whiteBalance) {
        this.whiteBalance = whiteBalance;
    }

    /**
     * 
     * @return
     *     The make
     */
    public String getMake() {
        return make;
    }

    /**
     * 
     * @param make
     *     The make
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * 
     * @return
     *     The model
     */
    public String getModel() {
        return model;
    }

    /**
     * 
     * @param model
     *     The model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * 
     * @return
     *     The copyright
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * 
     * @param copyright
     *     The copyright
     */
    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    /**
     * 
     * @return
     *     The editStack
     */
    public EditStack getEditStack() {
        return editStack;
    }

    /**
     * 
     * @param editStack
     *     The edit_stack
     */
    public void setEditStack(EditStack editStack) {
        this.editStack = editStack;
    }

    /**
     * 
     * @return
     *     The collection
     */
    public Collection getCollection() {
        return collection;
    }

    /**
     * 
     * @param collection
     *     The collection
     */
    public void setCollection(Collection collection) {
        this.collection = collection;
    }

}
