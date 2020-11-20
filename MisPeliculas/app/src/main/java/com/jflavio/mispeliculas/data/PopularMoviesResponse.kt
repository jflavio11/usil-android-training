package com.jflavio.mispeliculas.data

import com.google.gson.annotations.SerializedName

/**
 * PopularMoviesResponse
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  20/11/2020
 */
data class PopularMoviesResponse (

    @SerializedName("page")
    val page: Int,

    @SerializedName("total_results")
    val totalResults: Int,

    @SerializedName("total_pages")
    val totalPages: Int,

    @SerializedName("results")
    val movieList: List<MovieEntity>

)