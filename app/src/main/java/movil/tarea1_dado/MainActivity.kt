package movil.tarea1_dado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    var textos: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textos= findViewById<EditText>(R.id.Numero)
    }fun Crear(view: View) {
        var Lado:String=textos?.text.toString()
        val intent_Pantalla = Intent(this, Mostra_R::class.java)
        val valor=Lado?.toInt()
        val myFirstDice = valor?.let { Randoms(it) }
        val dato=myFirstDice?.roll().toString()
        // start your next activity
        startActivity(intent_Pantalla.putExtra("lados",Lado))
        startActivity(intent_Pantalla.putExtra("valores",dato))

    }
    fun Regresar_a_Inicio(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        // start your next activity
        startActivity(intent)
    }
    class Randoms (val numSides: Int) {

        fun roll(): Int {
            return (1..numSides).random()
        }
    }
}