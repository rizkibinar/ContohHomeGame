package id.co.rizki.gamesuitnext

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.google.android.material.snackbar.Snackbar
import id.co.rizki.gamesuitnext.game.GameActivity

class MainActivity : AppCompatActivity() {

    lateinit var ivSingle : ImageView
    lateinit var ivCpu : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ivSingle = findViewById(R.id.iv_single)
        ivCpu = findViewById(R.id.iv_cpu)

        Snackbar.make(ivSingle, "Selamat Datang ke Permainan Suit", Snackbar.LENGTH_SHORT).show()

        ivSingle.setOnClickListener {
            startActivity(Intent(this, GameActivity::class.java))
        }
        ivCpu.setOnClickListener {
            startActivity(Intent(this, GameActivity::class.java))
        }



    }
}