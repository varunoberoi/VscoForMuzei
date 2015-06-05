
package com.rubird.vscoformuzei.pojo;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Medium {

    @SerializedName("_id")
    @Expose
    private String Id;
    @SerializedName("adaptive_base")
    @Expose
    private String adaptiveBase;
    @SerializedName("capture_date")
    @Expose
    private long captureDate;
    @SerializedName("capture_date_ms")
    @Expose
    private long captureDateMs;
    @SerializedName("copyright_classes")
    @Expose
    private List<String> copyrightClasses = new ArrayList<String>();
    @Expose
    private String description;
    @SerializedName("description_anchored")
    @Expose
    private String descriptionAnchored;
    @SerializedName("grid_name")
    @Expose
    private String gridName;
    @Expose
    private long height;
    @SerializedName("image_meta")
    @Expose
    private ImageMeta imageMeta;
    @SerializedName("image_status")
    @Expose
    private ImageStatus imageStatus;
    @SerializedName("last_updated")
    @Expose
    private long lastUpdated;
    @SerializedName("location_coords")
    @Expose
    private List<Float> locationCoords = new ArrayList<Float>();
    @SerializedName("has_location")
    @Expose
    private boolean hasLocation;
    @SerializedName("perma_domain")
    @Expose
    private String permaDomain;
    @Expose
    private String permalink;
    @Expose
    private Preset preset;
    @SerializedName("responsive_url")
    @Expose
    private String responsiveUrl;
    @SerializedName("share_link")
    @Expose
    private String shareLink;
    @SerializedName("show_location")
    @Expose
    private long showLocation;
    @SerializedName("site_id")
    @Expose
    private long siteId;
    @Expose
    private List<Object> tags = new ArrayList<Object>();
    @SerializedName("upload_date")
    @Expose
    private long uploadDate;
    @Expose
    private long width;
    @SerializedName("feature_link")
    @Expose
    private Object featureLink;
    @SerializedName("is_featured")
    @Expose
    private boolean isFeatured;
    @SerializedName("perma_subdomain")
    @Expose
    private String permaSubdomain;

    /**
     * 
     * @return
     *     The Id
     */
    public String getId() {
        return Id;
    }

    /**
     * 
     * @param Id
     *     The _id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * 
     * @return
     *     The adaptiveBase
     */
    public String getAdaptiveBase() {
        return adaptiveBase;
    }

    /**
     * 
     * @param adaptiveBase
     *     The adaptive_base
     */
    public void setAdaptiveBase(String adaptiveBase) {
        this.adaptiveBase = adaptiveBase;
    }

    /**
     * 
     * @return
     *     The captureDate
     */
    public long getCaptureDate() {
        return captureDate;
    }

    /**
     * 
     * @param captureDate
     *     The capture_date
     */
    public void setCaptureDate(long captureDate) {
        this.captureDate = captureDate;
    }

    /**
     * 
     * @return
     *     The captureDateMs
     */
    public long getCaptureDateMs() {
        return captureDateMs;
    }

    /**
     * 
     * @param captureDateMs
     *     The capture_date_ms
     */
    public void setCaptureDateMs(long captureDateMs) {
        this.captureDateMs = captureDateMs;
    }

    /**
     * 
     * @return
     *     The copyrightClasses
     */
    public List<String> getCopyrightClasses() {
        return copyrightClasses;
    }

    /**
     * 
     * @param copyrightClasses
     *     The copyright_classes
     */
    public void setCopyrightClasses(List<String> copyrightClasses) {
        this.copyrightClasses = copyrightClasses;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The descriptionAnchored
     */
    public String getDescriptionAnchored() {
        return descriptionAnchored;
    }

    /**
     * 
     * @param descriptionAnchored
     *     The description_anchored
     */
    public void setDescriptionAnchored(String descriptionAnchored) {
        this.descriptionAnchored = descriptionAnchored;
    }

    /**
     * 
     * @return
     *     The gridName
     */
    public String getGridName() {
        return gridName;
    }

    /**
     * 
     * @param gridName
     *     The grid_name
     */
    public void setGridName(String gridName) {
        this.gridName = gridName;
    }

    /**
     * 
     * @return
     *     The height
     */
    public long getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    public void setHeight(long height) {
        this.height = height;
    }

    /**
     * 
     * @return
     *     The imageMeta
     */
    public ImageMeta getImageMeta() {
        return imageMeta;
    }

    /**
     * 
     * @param imageMeta
     *     The image_meta
     */
    public void setImageMeta(ImageMeta imageMeta) {
        this.imageMeta = imageMeta;
    }

    /**
     * 
     * @return
     *     The imageStatus
     */
    public ImageStatus getImageStatus() {
        return imageStatus;
    }

    /**
     * 
     * @param imageStatus
     *     The image_status
     */
    public void setImageStatus(ImageStatus imageStatus) {
        this.imageStatus = imageStatus;
    }

    /**
     * 
     * @return
     *     The lastUpdated
     */
    public long getLastUpdated() {
        return lastUpdated;
    }

    /**
     * 
     * @param lastUpdated
     *     The last_updated
     */
    public void setLastUpdated(long lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * 
     * @return
     *     The locationCoords
     */
    public List<Float> getLocationCoords() {
        return locationCoords;
    }

    /**
     * 
     * @param locationCoords
     *     The location_coords
     */
    public void setLocationCoords(List<Float> locationCoords) {
        this.locationCoords = locationCoords;
    }

    /**
     * 
     * @return
     *     The hasLocation
     */
    public boolean isHasLocation() {
        return hasLocation;
    }

    /**
     * 
     * @param hasLocation
     *     The has_location
     */
    public void setHasLocation(boolean hasLocation) {
        this.hasLocation = hasLocation;
    }

    /**
     * 
     * @return
     *     The permaDomain
     */
    public String getPermaDomain() {
        return permaDomain;
    }

    /**
     * 
     * @param permaDomain
     *     The perma_domain
     */
    public void setPermaDomain(String permaDomain) {
        this.permaDomain = permaDomain;
    }

    /**
     * 
     * @return
     *     The permalink
     */
    public String getPermalink() {
        return permalink;
    }

    /**
     * 
     * @param permalink
     *     The permalink
     */
    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    /**
     * 
     * @return
     *     The preset
     */
    public Preset getPreset() {
        return preset;
    }

    /**
     * 
     * @param preset
     *     The preset
     */
    public void setPreset(Preset preset) {
        this.preset = preset;
    }

    /**
     * 
     * @return
     *     The responsiveUrl
     */
    public String getResponsiveUrl() {
        return responsiveUrl;
    }

    /**
     * 
     * @param responsiveUrl
     *     The responsive_url
     */
    public void setResponsiveUrl(String responsiveUrl) {
        this.responsiveUrl = responsiveUrl;
    }

    /**
     * 
     * @return
     *     The shareLink
     */
    public String getShareLink() {
        return shareLink;
    }

    /**
     * 
     * @param shareLink
     *     The share_link
     */
    public void setShareLink(String shareLink) {
        this.shareLink = shareLink;
    }

    /**
     * 
     * @return
     *     The showLocation
     */
    public long getShowLocation() {
        return showLocation;
    }

    /**
     * 
     * @param showLocation
     *     The show_location
     */
    public void setShowLocation(long showLocation) {
        this.showLocation = showLocation;
    }

    /**
     * 
     * @return
     *     The siteId
     */
    public long getSiteId() {
        return siteId;
    }

    /**
     * 
     * @param siteId
     *     The site_id
     */
    public void setSiteId(long siteId) {
        this.siteId = siteId;
    }

    /**
     * 
     * @return
     *     The tags
     */
    public List<Object> getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    /**
     * 
     * @return
     *     The uploadDate
     */
    public long getUploadDate() {
        return uploadDate;
    }

    /**
     * 
     * @param uploadDate
     *     The upload_date
     */
    public void setUploadDate(long uploadDate) {
        this.uploadDate = uploadDate;
    }

    /**
     * 
     * @return
     *     The width
     */
    public long getWidth() {
        return width;
    }

    /**
     * 
     * @param width
     *     The width
     */
    public void setWidth(long width) {
        this.width = width;
    }

    /**
     * 
     * @return
     *     The featureLink
     */
    public Object getFeatureLink() {
        return featureLink;
    }

    /**
     * 
     * @param featureLink
     *     The feature_link
     */
    public void setFeatureLink(Object featureLink) {
        this.featureLink = featureLink;
    }

    /**
     * 
     * @return
     *     The isFeatured
     */
    public boolean isIsFeatured() {
        return isFeatured;
    }

    /**
     * 
     * @param isFeatured
     *     The is_featured
     */
    public void setIsFeatured(boolean isFeatured) {
        this.isFeatured = isFeatured;
    }

    /**
     * 
     * @return
     *     The permaSubdomain
     */
    public String getPermaSubdomain() {
        return permaSubdomain;
    }

    /**
     * 
     * @param permaSubdomain
     *     The perma_subdomain
     */
    public void setPermaSubdomain(String permaSubdomain) {
        this.permaSubdomain = permaSubdomain;
    }

}
