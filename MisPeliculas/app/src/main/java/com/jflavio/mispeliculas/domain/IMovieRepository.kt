package com.jflavio.mispeliculas.domain

/**
 * IMovieRepository
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  24/10/2020
 */
interface IMovieRepository {

    fun getMovies(): List<Movie>

}