
package com.example.instagram.model;

import com.example.instagram.model.Counts;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Data {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("profile_picture")
    @Expose
    private String profilePicture;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("bio")
    @Expose
    private String bio;
    @SerializedName("website")
    @Expose
    private String website;
    @SerializedName("is_business")
    @Expose
    private Boolean isBusiness;
    @SerializedName("counts")
    @Expose
    private Counts counts;
    //edited
    private List<Data> Data;

    /**
     * No args constructor for use in serialization
     *
     * @param s
     * @param b
     */
    public Data(String s, boolean b) {
    }

    /**
     * 
     * @param profilePicture
     * @param website
     * @param isBusiness
     * @param counts
     * @param fullName
     * @param bio
     * @param id
     * @param username
     */
    public Data(String id, String username, String profilePicture, String fullName, String bio, String website, Boolean isBusiness, Counts counts) {
        super();
        this.id = id;
        this.username = username;
        this.profilePicture = profilePicture;
        this.fullName = fullName;
        this.bio = bio;
        this.website = website;
        this.isBusiness = isBusiness;
        this.counts = counts;
    }

//                            private static int lastcenterId = 0;
//
//                            public static ArrayList<Data> createcenterList(int numcenter) {
//                                ArrayList<Data> contacts = new ArrayList<Data>();
//                                for (int i = 1; i <= numcenter; i++) {
//                                    contacts.add(new Data("Person " + ++lastcenterId, i <= numcenter / 2));
//                                }
//
//                                return contacts;
//
//                            }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Boolean getIsBusiness() {
        return isBusiness;
    }

    public void setIsBusiness(Boolean isBusiness) {
        this.isBusiness = isBusiness;
    }

    public Counts getCounts() {
        return counts;
    }

    public void setCounts(Counts counts) {
        this.counts = counts;
    }

    public List<Data> getData() {
        return Data;
    }
}
