package com.example.instagram.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Datum {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("images")
    @Expose
    private Images images;
    @SerializedName("created_time")
    @Expose
    private String createdTime;
    @SerializedName("caption")
    @Expose
    private Object caption;
    @SerializedName("user_has_liked")
    @Expose
    private Boolean userHasLiked;
    @SerializedName("likes")
    @Expose
    private Likes likes;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("filter")
    @Expose
    private String filter;
    @SerializedName("comments")
    @Expose
    private Comments comments;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("attribution")
    @Expose
    private Object attribution;
    @SerializedName("users_in_photo")
    @Expose
    private List<Object> usersInPhoto = null;
    @SerializedName("carousel_media")
    @Expose
    private List<CarouselMedium> carouselMedia = null;
    @SerializedName("videos")
    @Expose
    private Videos videos;
    @SerializedName("video_views")
    @Expose
    private Integer videoViews;

    /**
     * No args constructor for use in serialization
     *
     */
    public Datum() {
    }

    /**
     *
     * @param carouselMedia
     * @param images
     * @param comments
     * @param link
     * @param caption
     * @param videos
     * @param type
     * @param tags
     * @param userHasLiked
     * @param filter
     * @param attribution
     * @param createdTime
     * @param location
     * @param id
     * @param user
     * @param usersInPhoto
     * @param videoViews
     * @param likes
     */
    public Datum(String id, User user, Images images, String createdTime, Object caption, Boolean userHasLiked, Likes likes, List<String> tags, String filter, Comments comments, String type, String link, Location location, Object attribution, List<Object> usersInPhoto, List<CarouselMedium> carouselMedia, Videos videos, Integer videoViews) {
        super();
        this.id = id;
        this.user = user;
        this.images = images;
        this.createdTime = createdTime;
        this.caption = caption;
        this.userHasLiked = userHasLiked;
        this.likes = likes;
        this.tags = tags;
        this.filter = filter;
        this.comments = comments;
        this.type = type;
        this.link = link;
        this.location = location;
        this.attribution = attribution;
        this.usersInPhoto = usersInPhoto;
        this.carouselMedia = carouselMedia;
        this.videos = videos;
        this.videoViews = videoViews;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public Object getCaption() {
        return caption;
    }

    public void setCaption(Object caption) {
        this.caption = caption;
    }

    public Boolean getUserHasLiked() {
        return userHasLiked;
    }

    public void setUserHasLiked(Boolean userHasLiked) {
        this.userHasLiked = userHasLiked;
    }

    public Likes getLikes() {
        return likes;
    }

    public void setLikes(Likes likes) {
        this.likes = likes;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public Comments getComments() {
        return comments;
    }

    public void setComments(Comments comments) {
        this.comments = comments;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Object getAttribution() {
        return attribution;
    }

    public void setAttribution(Object attribution) {
        this.attribution = attribution;
    }

    public List<Object> getUsersInPhoto() {
        return usersInPhoto;
    }

    public void setUsersInPhoto(List<Object> usersInPhoto) {
        this.usersInPhoto = usersInPhoto;
    }

    public List<CarouselMedium> getCarouselMedia() {
        return carouselMedia;
    }

    public void setCarouselMedia(List<CarouselMedium> carouselMedia) {
        this.carouselMedia = carouselMedia;
    }

    public Videos getVideos() {
        return videos;
    }

    public void setVideos(Videos videos) {
        this.videos = videos;
    }

    public Integer getVideoViews() {
        return videoViews;
    }

    public void setVideoViews(Integer videoViews) {
        this.videoViews = videoViews;
    }

}