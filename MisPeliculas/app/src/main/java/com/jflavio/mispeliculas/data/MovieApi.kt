package com.jflavio.mispeliculas.data

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

/**
 * MovieApi
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  20/11/2020
 */
interface MovieApi {

    @GET("movie/popular?api_key=PUT_YOUR_API_KEY_HERE")
    fun getPopularMovies(): Call<PopularMoviesResponse>


    companion object {


        fun createApi(): MovieApi {

            val retrofit = Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org/3/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()


            return retrofit.create(MovieApi::class.java)

        }


    }


}