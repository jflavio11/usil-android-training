package com.jflavio.mispeliculas.presentation

import com.jflavio.mispeliculas.data.WebServiceMovieRepository
import com.jflavio.mispeliculas.domain.IMovieRepository

/**
 * MoviePresenterImpl
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  24/10/2020
 */
class MoviePresenterImpl(
    private val movieRepo: IMovieRepository = WebServiceMovieRepository(),
    private val view: MovieView
) : MoviePresenter {


    override fun requestMovies() {

        movieRepo.getMovies( onError = { error ->

            view.showError(error.message.orEmpty())

        }, onSuccess = { movies ->

            view.showMovies(movies)

        })

    }


}