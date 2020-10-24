package com.jflavio.mispeliculas.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jflavio.mispeliculas.R
import com.jflavio.mispeliculas.domain.Movie
import kotlinx.android.synthetic.main.item_movie.view.*

/**
 * MoviesRvAdapter
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  24/10/2020
 */
class MoviesRvAdapter(
    private val movieList: List<Movie>
) : RecyclerView.Adapter<MovieHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieHolder {
        return MovieHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MovieHolder, position: Int) {

        holder.bind(    movieList[position]   )

    }

    override fun getItemCount() = movieList.size


}


class MovieHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun bind(movie: Movie) {

        itemView.movieItem_tv_title.text = movie.name
        itemView.movieItem_tv_description.text = movie.description

    }

}
