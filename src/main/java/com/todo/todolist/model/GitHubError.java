package com.todo.todolist.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GitHubError {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("documentation_url")
    @Expose
    private String documentationUrl;

    public GitHubError(String message, String documentationUrl) {
        this.message = message;
        this.documentationUrl = documentationUrl;
    }

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

    @Override
    public String toString() {
        return "{" +
                "message='" + message + '\'' +
                ", documentationUrl='" + documentationUrl + '\'' +
                '}';
    }
}