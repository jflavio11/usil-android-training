package com.jflavio.mispeliculas.data

import com.jflavio.mispeliculas.domain.IMovieRepository
import com.jflavio.mispeliculas.domain.Movie
import retrofit2.Call
import retrofit2.Response
import java.lang.Exception

/**
 * WebServiceMovieRepository
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  24/10/2020
 */
class WebServiceMovieRepository (
    private val api: MovieApi = MovieApi.createApi()
) : IMovieRepository {

    override fun getMovies(  onSuccess : (List<Movie>) -> Unit  ,  onError : (Throwable) -> Unit ) {


        api.getPopularMovies().enqueue( object: retrofit2.Callback<PopularMoviesResponse> {

            override fun onResponse(
                call: Call<PopularMoviesResponse>,
                response: Response<PopularMoviesResponse>
            ) {


                if ( response.body() != null ) {

                    val movieList = response.body()?.movieList?.map {
                        it.toDomain()
                    }

                    onSuccess( movieList ?: emptyList() )

                } else {

                    onError(Exception("Error"))

                }

            }

            override fun onFailure(call: Call<PopularMoviesResponse>, t: Throwable) {

                onError(t)

            }


        } )


    }

}