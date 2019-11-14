
package com.example.instagram.model;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
public class Counts {

    @SerializedName("media")
    @Expose
    @PrimaryKey
    private Integer media;
    @SerializedName("follows")
    @Expose
    private Integer follows;
    @SerializedName("followed_by")
    @Expose
    private Integer followedBy;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Counts() {
    }

    /**
     * 
     * @param followedBy
     * @param follows
     * @param media
     */
    @Ignore
    public Counts(Integer media, Integer follows, Integer followedBy) {
        super();
        this.media = media;
        this.follows = follows;
        this.followedBy = followedBy;
    }

    public Integer getMedia() {
        return media;
    }

    public void setMedia(Integer media) {
        this.media = media;
    }

    public Integer getFollows() {
        return follows;
    }

    public void setFollows(Integer follows) {
        this.follows = follows;
    }

    public Integer getFollowedBy() {
        return followedBy;
    }

    public void setFollowedBy(Integer followedBy) {
        this.followedBy = followedBy;
    }

}
