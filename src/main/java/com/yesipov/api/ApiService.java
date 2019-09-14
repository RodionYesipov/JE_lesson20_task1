package com.yesipov.api;

import com.yesipov.model.albums.Albums;
import com.yesipov.model.comments.Comments;
import com.yesipov.model.photos.Photos;
import com.yesipov.model.posts.Post;
import com.yesipov.model.todos.Todos;
import com.yesipov.model.users.User;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface ApiService {

    @GET("posts")
    Call<List<Post>> getPosts();

    @GET("comments")
    Call<List<Comments>> getComments();

    @GET("albums")
    Call<List<Albums>> getAlbums();

    @GET("photos")
    Call<List<Photos>> getPhotos();

    @GET("users")
    Call<List<User>> getUsers();

    @GET("todos")
    Call<List<Todos>> getTodos();



}