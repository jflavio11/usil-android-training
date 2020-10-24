package com.jflavio.mispeliculas.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.jflavio.mispeliculas.R
import com.jflavio.mispeliculas.data.LocalMovieRepository
import com.jflavio.mispeliculas.domain.Movie
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MovieView {

    private lateinit var presenter: MoviePresenter

    private lateinit var adapter: MoviesRvAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MoviePresenterImpl(
            movieRepo = LocalMovieRepository(),
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

    }

}