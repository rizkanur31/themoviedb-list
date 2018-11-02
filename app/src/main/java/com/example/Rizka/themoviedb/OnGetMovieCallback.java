package com.example.Rizka.themoviedb;

public interface OnGetMovieCallback {

    void onSuccess(Movie movie);

    void onError();
}
