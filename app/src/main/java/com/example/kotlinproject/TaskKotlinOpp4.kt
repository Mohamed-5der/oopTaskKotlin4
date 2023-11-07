package com.example.kotlinproject

fun main(){
 println("Choose Game:")
 println("1. Football  2. Basketball  3. Karate  4. Chess")

 val choose = readLine()?.toInt() ?:1
 printGame(choose)
}
fun printGame (choose :Int){
   when (choose) {
     1 ->{
      val foot = Football()
      foot.printInformationGame()
     }
    2 ->{
     val bask = Basketball()
     bask.printInformationGame()
    }
    3 ->{
     val karate = Karate()
     karate.printInformationGame()
    }
    4  ->{
     val chess = Chess()
     chess.printInformationGame()
    }
   }
}
open class Game(val nameGame :String,val GamePlayersNumber :Int,val GameBall:String,val GameStatus :String){
     fun printInformationGame(){
        println("Name Game : $nameGame GamePlayersNum : $GamePlayersNumber GameBall : $GameBall  GameStatus : $GameStatus")
     }
}
 class Football :Game ( "Football",  11 ,  "have ball" , "collective"){

}
 class Basketball :Game (   "Basketball",  5 , "have ball", "collective"){

 }
 class Karate : Game ("Karate", 1, "not have ball", "individually"){

 }
 class Chess :Game( "Chess", 1, "not have ball", "individually"){
 }

