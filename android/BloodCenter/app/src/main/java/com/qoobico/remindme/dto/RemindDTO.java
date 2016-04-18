package com.qoobico.remindme.dto;

/**
 * Created by neil on 4/13/2016.
 */
public class RemindDTO {

    private String title;

    public RemindDTO(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
