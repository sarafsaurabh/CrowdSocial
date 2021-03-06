package com.crowdsocial.model;

import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseRelation;
import com.parse.ParseUser;

import java.util.Date;

@ParseClassName("Event")
public class Event extends ParseObject {
    private String title;
    private String description;
    private String location;
    private int maxParticipants;
    private int participationAmount;
    private String imageUrl;
    private ParseUser user;
    private String theme;
    private Date eventDate;

    public String getTitle() {
        return getString("title");
    }

    public void setTitle(String title) {
        put("title", title);
    }

    public String getDescription() {
        return getString("description");
    }

    public void setDescription(String description) {
        put("description", description);
    }

    public String getLocation() {
        return getString("location");
    }

    public void setLocation(String location) {
        put("location", location);
    }

    public int getMaxParticipants() {
        return getInt("maxParticipants");
    }

    public void setMaxParticipants(int maxParticipants) {
        put("maxParticipants", maxParticipants);
    }

    public int getParticipationAmount() {
        return getInt("participationAmount");
    }

    public void setParticipationAmount(int participationAmount) {
        put("participationAmount", participationAmount);
    }

    public String getImageUrl() {
        return getString("imageUrl");
    }

    public void setImageUrl(String imageUrl) {
        put("imageUrl", imageUrl);
    }

    public void setUser(ParseUser user) {
        put("user", user);
    }

    public ParseUser getUser() {
        return (ParseUser) getParseObject("user");
    }

    public String getTheme() {
        return getString("theme");
    }

    public void setTheme(String theme) {
        put("theme", theme);
    }

    public Date getEventDate() {
        return getDate("eventDate");
    }

    public void setEventDate(Date eventDate) {
        put("eventDate", eventDate);
    }

    public ParseRelation<Invitee> getInviteesRelation() {
        return getRelation("invitees");
    }

    public void addInvitee(Invitee invitee) {
        getInviteesRelation().add(invitee);
        saveInBackground();
    }

    public void removeInvitee(Invitee invitee) {
        getInviteesRelation().remove(invitee);
        saveInBackground();
    }
}
