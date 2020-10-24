package com.jflavio.mispeliculas.presentation

import com.jflavio.mispeliculas.data.LocalMovieRepository
import com.jflavio.mispeliculas.domain.IMovieRepository

/**
 * MoviePresenterImpl
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  24/10/2020
 */
class MoviePresenterImpl(
    private val movieRepo: IMovieRepository = LocalMovieRepository(),
    private val view: MovieView
) : MoviePresenter {


    override fun requestMovies() {

        val list = movieRepo.getMovies()

        view.showMovies(list)

    }


}