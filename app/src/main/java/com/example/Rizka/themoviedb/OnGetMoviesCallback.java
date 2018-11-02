package com.example.Rizka.themoviedb;

import java.util.List;

public interface OnGetMoviesCallback {

        void onSuccess(int page,List<Movie> movies);

        void onError();

}
