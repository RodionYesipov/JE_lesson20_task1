package com.yesipov;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yesipov.api.MyApiService;
import java.util.List;
/**
 1) Написать класс MyApiService с использованием паттерна синглтон для доступа к API:
 (предварительно создать все необходимые модели List, Post, User...)

 Пример:
 ApiService service = ApiService.getInstance();
 List<Post> posts = service.getPosts();
 List<User> users = service.getUses();

 Для следующих запросов:
 Posts https://jsonplaceholder.typicode.com/posts
 Comments https://jsonplaceholder.typicode.com/comments
 Albums https://jsonplaceholder.typicode.com/albums
 Photos https://jsonplaceholder.typicode.com/photos
 Users https://jsonplaceholder.typicode.com/users
 Todos https://jsonplaceholder.typicode.com/todos
* */
public class Main {

    public static void main(String[] args) {
        List posts = MyApiService.getPosts();
        List comments = MyApiService.getComments();
        List albums = MyApiService.getAlbums();
        List photos = MyApiService.getPhotos();
        List users = MyApiService.getUsers();
        List todos = MyApiService.getTodos();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        int index = 0;
        System.out.println("\n\nGet " + index + " post \n" + gson.toJson(posts.get(0)));
        System.out.println("\n\nGet " + index + " comment \n" + gson.toJson(comments.get(0)));
        System.out.println("\n\nGet " + index + " album \n" + gson.toJson(albums.get(0)));
        System.out.println("\n\nGet " + index + " photo \n" + gson.toJson(photos.get(0)));
        System.out.println("\n\nGet " + index + " user \n" + gson.toJson(users.get(0)));
        System.out.println("\n\nGet " + index + " todo \n" + gson.toJson(todos.get(0)));
    }
}