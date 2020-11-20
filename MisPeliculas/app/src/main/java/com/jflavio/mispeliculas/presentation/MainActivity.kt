package com.jflavio.mispeliculas.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.jflavio.mispeliculas.R
import com.jflavio.mispeliculas.data.LocalMovieRepository
import com.jflavio.mispeliculas.data.WebServiceMovieRepository
import com.jflavio.mispeliculas.domain.Movie
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MovieView {

    private lateinit var presenter: MoviePresenter

    private lateinit var adapter: MoviesRvAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MoviePresenterImpl(
            movieRepo = WebServiceMovieRepository(),
            view = this
        )

        presenter.requestMovies()

    }

    override fun showMovies(movies: List<Movie>) {

        adapter = MoviesRvAdapter(movies)

        mainRv.adapter = adapter
        mainRv.layoutManager = LinearLayoutManager(this)

    }

    override fun showError(message: String) {
        Log.d("Error", message)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

}