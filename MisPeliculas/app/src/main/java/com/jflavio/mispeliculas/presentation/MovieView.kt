package com.jflavio.mispeliculas.presentation

import com.jflavio.mispeliculas.domain.Movie

/**
 * MovieView
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  24/10/2020
 */
interface MovieView {


    fun showMovies(movies: List<Movie>)


    fun showError(message: String)


}