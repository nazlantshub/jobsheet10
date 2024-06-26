package id.ac.poilnema.androidbundleactivity

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    private lateinit var namaEdit : TextView
    private lateinit var kelasEdit : TextView
    private lateinit var nimEdit : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        namaView = findViewById(R.id.namaView)
        kelasView = findViewById(R.id.kelasViewView)
        nimView = findViewById(R.id.nimView)

        val extras = intent.extras

        namaView.text = extras?.getString("nama")
        kelasView.text = extras?.getString("kelas")
        nimView.text = extras?.getString("nim")
    }
}