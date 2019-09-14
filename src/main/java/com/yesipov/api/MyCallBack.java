package com.yesipov.api;

import retrofit2.Call;

public interface MyCallBack<T> extends retrofit2.Callback<T> {

    @Override
    default void onFailure(Call<T> call, Throwable t) {
        System.out.println("Error:" + t);
    }

}