package id.ac.poilnema.androidbundleactivity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsand
import android
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var namaEdit : EditText
    private lateinit var kelasEdit : EditText
    private lateinit var nimEdit : EditText
    private lateinit var submitBtn : Button

    private val NAME_KEY : String = "nama"
    private val CLASS_KEY : String = "kelas"
    private val NIM_KEY : String = "nim"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        namaEdit = findViewById(R.id.namaEdit)
        kelasEdit = findViewById(R.id.kelasEdit)
        nimEdit = findViewById(R.id.nimEdit)
        submitBtn = findViewById(submitBtn)

        submitBtn.setOnClickListener {
            val intent = intent(this, MainActivity2::class.java)
            intent.putExtra(NAME_KEY, namaEdit.text.toString())
            intent.putExtra(CLASS_KEY, kelasEdit.text.toString())
            intent.putExtra(NIM_KEY, nimEdit.text.toString())
            startActivity(intent)
        }
    }
}