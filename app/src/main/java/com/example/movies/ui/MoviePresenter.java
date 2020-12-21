package com.example.movies.ui;

import com.example.movies.pojo.MovieModel;

public class MoviePresenter {
    MovieView view;

    public MoviePresenter(MovieView view) {
        this.view = view;
    }
    public MovieModel getMovieFromDatabase(){

        return new MovieModel("Lala Land", "24-10-1993","very happy",1);
    }

    public void getMovieName(){
        view.onGetMovieName(getMovieFromDatabase().getName());
    }
}
