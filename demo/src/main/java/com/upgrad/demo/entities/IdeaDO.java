package com.upgrad.demo.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * This IdeaDO object will be used to store the idea resouce
 * in the internal storage system.
 */

public class IdeaDO {

    private long id;

    private String ideaName;

    private String authorName;

    private String ideaDescription;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdeaName() {
        return ideaName;
    }

    public void setIdeaName(String ideaName) {
        this.ideaName = ideaName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getIdeaDescription() {
        return ideaDescription;
    }

    public void setIdeaDescription(String ideaDescription) {
        this.ideaDescription = ideaDescription;
    }

    @Override
    public String toString() {
        return "IdeaDO{" +
                "id=" + id +
                ", ideaName='" + ideaName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", ideaDescription='" + ideaDescription + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdeaDO ideaDO = (IdeaDO) o;
        return id == ideaDO.id &&
                Objects.equals(ideaName, ideaDO.ideaName) &&
                Objects.equals(authorName, ideaDO.authorName) &&
                Objects.equals(ideaDescription, ideaDO.ideaDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ideaName, authorName, ideaDescription);
    }
}
