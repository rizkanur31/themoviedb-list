package com.example.Rizka.themoviedb;

import java.util.List;

public interface OnGetsCastsCallback {

    void onSuccess(List<Cast> casts);

    void onError();
}
