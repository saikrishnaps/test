package com.datstorm.imageviews.callbacks;

import org.jetbrains.annotations.NotNull;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetrofitMainCallback<T> implements Callback<T> {
    private final RetrofitCallback<T> callback;
    public RetrofitMainCallback(RetrofitCallback<T> callback) {
        this.callback = callback;
    }

    @Override
    public void onResponse(@NotNull Call<T> call, Response<T> response) {
        callback.onEverytime();
        int responseCode = response.code();
        System.out.println("rededededsponseCode = " + responseCode);
        if (responseCode == 200 || responseCode == 201){
            if (response.body() != null) {
                callback.onSuccessfulResponse(response);
            }
           return;
        }
        if (responseCode >= 500) {
            callback.onServerError(response);
            return;
        }
        if (responseCode == 401) {
            callback.onUnAuthorized();
            return;
        }
        if (responseCode == 403) {
            callback.onForbidden();
            return;
        }
        if (responseCode >= 400) {
            callback.onBadRequest(response);

        }
    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {
        callback.onEverytime();
        System.out.println("t.toString() = " + t.toString());
        callback.onFailure("Unable to connect to server. Please Try after sometime");
    }
}