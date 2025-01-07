package es.aketzagonzalez.juegoajedrez

import android.graphics.Point
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TableRow
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniciarJuego()
    }

    private fun iniciarJuego() {
        setSizeBoard()
        hideMessage()
    }

    private fun hideMessage() {
        var mensajeFin:LinearLayout=findViewById(R.id.llMensaje)
        mensajeFin.visibility=View.INVISIBLE
    }

    private fun setSizeBoard() {

    }

    fun checkCellCLicked(view: View) {

    }
}