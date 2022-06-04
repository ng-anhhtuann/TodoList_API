package com.todo.todolist.model;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GitHubUserItem {
    @SerializedName("avatar_url")
    @Expose
    private String avatarUrl;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;

    @SerializedName("name")
    @Expose
    private Object name;
    @SerializedName("company")
    @Expose
    private Object company;
    @SerializedName("location")
    @Expose
    private Object location;
    @SerializedName("bio")
    @Expose
    private Object bio;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("documentation_url")
    @Expose
    private String documentationUrl;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDocumentationUrl() {
        return documentationUrl;
    }

    public void setDocumentationUrl(String documentationUrl) {
        this.documentationUrl = documentationUrl;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Object getCompany() {
        return company;
    }

    public void setCompany(Object company) {
        this.company = company;
    }

    public Object getLocation() {
        return location;
    }

    public void setLocation(Object location) {
        this.location = location;
    }

    public Object getBio() {
        return bio;
    }

    public void setBio(Object bio) {
        this.bio = bio;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "{\n" +
                "\tavatarUrl='" + avatarUrl + '\'' +
                ",\n\thtmlUrl='" + htmlUrl + '\'' +
                ",\n\tname=" + name +
                ",\n\tcompany=" + company +
                ",\n\tlocation=" + location +
                ",\n\tbio=" + bio +
                ",\n\tcreatedAt='" + createdAt + '\'' + "\n" +
                '}';
    }
}