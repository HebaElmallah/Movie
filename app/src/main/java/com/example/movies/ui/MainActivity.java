package com.example.movies.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.movies.R;
import com.example.movies.pojo.MovieModel;

public class MainActivity extends AppCompatActivity {
    TextView movieNameTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movieNameTV = findViewById(R.id.textView);

    }

    public MovieModel getMovieFromDatabase(){

        return new MovieModel("Lala Land", "24-10-1993","very happy",1);
    }

    public void getMovie(View view) {

        movieNameTV.setText(getMovieFromDatabase().getName());
    }
}