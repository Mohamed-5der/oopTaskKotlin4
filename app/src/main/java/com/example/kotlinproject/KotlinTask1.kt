package com.example.kotlinproject

fun main(){
    println("Enter number:")
    val n = readLine()?.toIntOrNull()
    var factorial :Int =1
    if (n!=null&& n > 0){
        for(item in 1 ..n!!){
            factorial *= item
        }
        println("the Factorial of ${n} is  = ${factorial}")
    }else {
        println("invalid")
    }

}


