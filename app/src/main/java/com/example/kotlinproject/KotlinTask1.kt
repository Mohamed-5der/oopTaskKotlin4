package com.example.kotlinproject

fun main(){
    println("Enter a Number:")
    val n = readLine()?.toIntOrNull()
    var x :Int =0
    if (n!=null&& n > 0){
        for(item in 1 ..n!!){
            x += item
        }
        println("the Factorial = ${x}")
    }else {
        println("number invalid")
    }

}


