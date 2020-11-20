package com.jflavio.mispeliculas.data

import com.google.gson.annotations.SerializedName
import com.jflavio.mispeliculas.domain.Movie

/**
 * MovieEntity
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  20/11/2020
 */
data class MovieEntity (

    @SerializedName("id")
    val id: Int,

    @SerializedName("title")
    val name: String,

    @SerializedName("overview")
    val overview: String

)

fun MovieEntity.toDomain(): Movie {
    return Movie(
        id = this.id,
        name = this.name,
        description = this.overview
    )
}