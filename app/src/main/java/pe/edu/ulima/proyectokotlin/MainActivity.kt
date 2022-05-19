package pe.edu.ulima.proyectokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

data class Cursos(val nombre:String, val url:String)

class MainActivity : AppCompatActivity() {
    //VARIABLES
    val react = Cursos("React", "react")
    val kot = Cursos("Kotlin","kotlin")

    val cursoActual = react.copy()

    //FUNCION PRINCIPAL
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById(R.id.botoncito) as Button
        boton.setOnClickListener{
            view -> verEnPantalla("Oh señor, me diste click :3")
        }
        //val txt = findViewById(R.id.mensaje) as TextView
        //txt.setText("Curso de ${kot.nombre} en platzi.com/${kot.url}")
        //verEnPantalla("Curso de ${cursoActual.nombre} en platzi.com/${cursoActual.url}")
    }

    //FUNCIONES SECUNDARIAS

    fun switchCurso(curso:Cursos){
        var c = curso.copy()
        when(curso.url){
            "react" -> c = react.copy()
            "kotlin" -> c = kot.copy()
            else -> print("Esto nunca va a pasar")
        }
    }

    fun verEnPantalla(s:String){
        val txt = findViewById(R.id.mensaje) as TextView
        txt.setText(s)
    }
}