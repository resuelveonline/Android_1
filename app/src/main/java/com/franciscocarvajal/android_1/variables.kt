package com.franciscocarvajal.android_1


// Esto es un comentario de una línea
// Este programa trata de variables

// Este es un comentario de bloque, es decir, en varias líneas

/*
**************************   TIPOS DE DATOS **************************
INT
Byte	1 Byte	-128 a 127
Short	2 Bytes	-32,768 a 32,767
Int	4 Bytes	-2,147,483,648 a 2,147,483,647
Long	8 Bytes	-2^63 a (2^63) – 1

DECIMALES

Float	4 Bytes	6 a 7 decimales
Double	8 Bytes	15 a 18 decimales

ALFANUMERICAS

Chat      1 carácter comillas simples  'a'
String    xx caracteres, comillas dobles  "Cadena de texto"

BOOLEANAS

Boolean    valores true o false

 */



/*
OPERADORES PRIMITIVOS

+ Suma
- Resta
* Multiplicación
/ División
% Módulo

 */

fun main ()
{
    // val es un valor, el equivalente a una constante.
    val age: Int = 30
    val sueldo:Float = 123.80f
    val name:String = "Francisco"
    val esCierto:Boolean = true
    println("Holas! $name")

    // Una variable usa la palabra reservada var

    var nombre: String = "Francisco Carvajal"
    println("Hola $nombre")
    println(5*4)
    println()
}