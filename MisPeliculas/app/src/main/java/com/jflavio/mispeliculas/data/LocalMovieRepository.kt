package com.jflavio.mispeliculas.data

import com.jflavio.mispeliculas.domain.IMovieRepository
import com.jflavio.mispeliculas.domain.Movie

/**
 * LocalMovieRepository
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  24/10/2020
 */
class LocalMovieRepository : IMovieRepository {


    override fun getMovies(): List<Movie> {
        val movie1 = Movie(
            id = 1,
            name = "Toy Story",
            description = "La película del vaquero."
        )

        val movie2 = Movie(
            id = 2,
            name = "Iron Mar",
            description = "La pelicula de Tony Stark. No me quiero ir señor Stark."
        )

        val movie3 = Movie(
            id = 2,
            name = "Toy Story 2",
            description = "Buzz Yogurt Light busca a Woody el vaquero."
        )

        return listOf(movie1, movie2, movie3)
    }


}