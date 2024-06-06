package com.example.listview

import android.content.ClipData.Item
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listview.ui.theme.ListViewTheme

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView: RecyclerView = findViewById(R.id.rvFood)
        recyclerView.layoutManager = LinearLayoutManager (this)

        val items = listOf(
            FoodItem(R.drawable.moeloek, "Rendang", "Makanan rendang bisa dikatakan sebagai makanan yang kelezatannya sudah mendunia. Rendang memang berasal dari Sumatra Barat, tetapi penggemarnya sudah mendunia. Para wisatawan mancanegara terpesona dengan kelezatan rendang dengan bumbunya yang kental kental."),
            FoodItem(R.drawable.bikaambon, "Bika Ambon", "Makanan yang identik dengan warna kuning dan sering digunakan untuk oleh-oleh adalah bika ambon. Meskipun namanya memuat kata ‘ambon’, makanan ini berasal dari Sumatera Utara. Makanan ini terbuat dari gula, santan, serta telur. Bika ambon digemari berbagai kalangan masyarakat karena rasanya yang lezat."),
            FoodItem(R.drawable.flavours, "Kerak Telor", "Kerak telor dibuat dari beras ketan putih, telur ayam atau telur bebek, serta ebi yang disangrai hingga kering. Sajian kerak telor akan lengkap dengan taburan bawang goreng. Sebenarnya masih ada bahan lain seperti kelapa sangrai, jahe, kencur, cabai merah, gula pasir, merica, dan garam yang membuat makanan ini bercita rasa lengkap.")
        )
        val adapter = FoodAdapter(items)
        recyclerView.adapter = adapter
    }

}