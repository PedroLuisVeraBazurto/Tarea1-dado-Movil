package movil.tarea1_dado

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class Mostra_R : AppCompatActivity() {
    var Texto_estatico: TextView? = null
    var Valor_Mostar: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostra_r)
        val Intent_obj: Intent =intent
        Texto_estatico= findViewById<EditText>(R.id.N_lados)
        Valor_Mostar= findViewById<EditText>(R.id.Resultado)
        var Ladoss=Intent_obj.getStringExtra("lados")
        var Valores=Intent_obj.getStringExtra("valores")
        Texto_estatico?.setText(Ladoss.toString())
        Valor_Mostar?.setText(Valores.toString())
    }
    fun Regresar_a_Inicio(view: View) {
        val activy = Intent(this, MainActivity::class.java)
        // start your next activity
        startActivity(activy)
    }
}
