package com.example.Rizka.themoviedb;

import java.util.List;

public interface OnGetTrailersCallback {

    void onSuccess(List<Trailer> trailers);

    void onError();
}
