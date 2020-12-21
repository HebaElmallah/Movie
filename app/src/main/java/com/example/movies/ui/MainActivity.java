package com.example.movies.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.movies.R;
import com.example.movies.pojo.MovieModel;

public class MainActivity extends AppCompatActivity implements View.OnClickListener , MovieView{

    MoviePresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getMoviewButton.setOnClickListener(this);
        presenter = new MoviePresenter(this);
    }


    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.button){

            presenter.getMovieName();
        }
    }

    @Override
    public void onGetMovieName(String movieName) {

        movieNameTV.setText(movieName);
    }
}