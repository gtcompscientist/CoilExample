package co.csadev.coilexample

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import coil.api.load

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recycler = findViewById<RecyclerView>(R.id.image_recycler)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = ImageAdapter { imageView, imageUrl ->
            imageView.load(imageUrl)
            {
                placeholder(ColorDrawable(Color.LTGRAY))
            }
            //Without something in the builder block, Coil fails to load images.
            //Comment out those lines to see
        }
    }
}
