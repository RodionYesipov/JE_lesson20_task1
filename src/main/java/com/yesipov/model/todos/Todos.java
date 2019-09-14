package com.yesipov.model.todos;

public class Todos {

    public Integer userId;
    public Integer id;
    public String title;
    public Boolean completed;


    public Todos() {
    }


    public Todos(Integer userId, Integer id, String title, Boolean completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Todos{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }
}