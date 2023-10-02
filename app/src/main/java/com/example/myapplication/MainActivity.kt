package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


* You can edit, run, and share this code.
* play.kotlinlang.org
*/
fun main(){
    val ancho = 8.0
    val userValidated = login ("", "Navaja")
    println("Usuario loggueado? $userValidated")

    println("El area del rectangulo es: ${rectanguloArea()} ")

    println("El volumen del prisma es: ${volumenPrisma(base = 30.0, altura = 10.0, ancho)}")


    println("El promedio es: ${promedio(tercera = 7f)}")

}

fun login (user: String, password : String) : Boolean {   //FUNCION LOCAL
    fun validate(input : String ) : Boolean{
        if(input.isEmpty() ){
            return false
        }
        return true
    }
    val userValidated = validate (user)
    val passValidated = validate (password)

    return userValidated && passValidated

}



fun rectanguloArea(bas : Double = 20.0, height : Double = 30.00): Double {
    return bas*height
}


fun volumenPrisma (base: Double, altura: Double, ancho: Double): Double{
    return rectanguloArea(base, altura)*ancho

}


fun promedio (primera : Float = 8f, segunda : Float = 7f, tercera : Float): Float{
    return (primera + segunda + tercera)/3f
}

