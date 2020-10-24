package com.jflavio.mispeliculas.data

import com.jflavio.mispeliculas.domain.IMovieRepository
import com.jflavio.mispeliculas.domain.Movie

/**
 * WebServiceMovieRepository
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  24/10/2020
 */
class WebServiceMovieRepository : IMovieRepository {

    override fun getMovies(): List<Movie> {
        return emptyList()
    }

}