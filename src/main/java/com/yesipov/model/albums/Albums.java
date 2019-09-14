package com.yesipov.model.albums;

public class Albums {

    public Integer userId;
    public Integer id;
    public String title;

    public Albums() {
    }

    public Albums(Integer userId, Integer id, String title) {
        this.userId = userId;
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Albums{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}