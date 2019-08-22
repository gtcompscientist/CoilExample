package co.csadev.coilexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.pandora.samples.imaging.Images

class ImageAdapter(private val imageLoader: (ImageView, String) -> Unit): RecyclerView.Adapter<ImageAdapter.ViewHolder>() {
    class ViewHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.row_image, parent, false))
    }

    override fun getItemCount() = Images.values().size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        imageLoader(holder.itemView.findViewById(R.id.row_image_view), Images.values()[position].url)
    }

}