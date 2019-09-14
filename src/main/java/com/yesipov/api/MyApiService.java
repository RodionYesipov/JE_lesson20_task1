package com.yesipov.api;

import com.yesipov.model.albums.Albums;
import com.yesipov.model.comments.Comments;
import com.yesipov.model.photos.Photos;
import com.yesipov.model.posts.Post;
import com.yesipov.model.todos.Todos;
import com.yesipov.model.users.User;

import java.util.List;

public class MyApiService{
    private MyApiService() {
    }

    public static List<Post> getPosts(){
        try {
            List<Post> posts = ApiManager.getApiService().getPosts().execute().body();
            return posts;
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
        return null;
    }

    public static List<Comments> getComments(){
        try {
            List<Comments> comments = ApiManager.getApiService().getComments().execute().body();
            return comments;
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
        return null;
    }

    public static List<Albums> getAlbums(){
        try {
            List<Albums> albums = ApiManager.getApiService().getAlbums().execute().body();
            return albums;
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
        return null;
    }

    public static List<Photos> getPhotos(){
        try {
            List<Photos> photos = ApiManager.getApiService().getPhotos().execute().body();
            return photos;
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
        return null;
    }

    public static List<User> getUsers(){
        try {
            List<User> users = ApiManager.getApiService().getUsers().execute().body();
            return users;
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
        return null;
    }

    public static List<Todos> getTodos(){
        try {
            List<Todos> todos = ApiManager.getApiService().getTodos().execute().body();
            return todos;
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
        return null;
    }
}
