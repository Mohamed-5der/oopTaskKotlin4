package com.example.kotlinproject

fun main () {
    var finish = true
    println("Choose Data and when finished, write finish ")
    println(
        ".(Mahmoud ,Football ,Mohammed ,20 ," + "Engineering , 25 , Basketball , Suzan , volleyball ," +
                "Science , 18 , Alaa , Medicine , Karate , 32 , Zeinab" + ", 27 , Chess , CIS , pharmacy )"
    )
    val name = mutableListOf<Any>("Mahmoud","Mohammed", "Alaa", "Zeinab","Suzan")
    val nameEdit = mutableListOf<Any>()
    val age = mutableListOf<Any>("20","18","25","27","32")
    val ageEdit = mutableListOf<Any>()
    val game = mutableListOf<Any>("Football","Karate", "Chess", "Basketball", "volleyball")
    val gameEdit = mutableListOf<Any>()
    val collage = mutableListOf<Any>("CIS", "pharmacy", "Medicine", "Science", "Engineering")
    val collageEdit = mutableListOf<Any>()
    while (finish) {
        println("input Data")
        val input = readLine()
        if (input != null) {
            if (input != "finish") {
                val filterName = name.filter { it.equals(input) }
                val filterAge = age.filter { it.equals(input) }
                val filterGame = game.filter { it.equals(input) }
                val filterCollage = collage.filter { it.equals(input) }
                if (filterName.isNotEmpty()) {
                    nameEdit.add(filterName)
                } else if (filterAge.isNotEmpty()) {
                    ageEdit.add(filterAge)
                } else if (filterGame.isNotEmpty()) {
                    gameEdit.add(filterGame)
                } else if (filterCollage.isNotEmpty()) {
                    collageEdit.add(filterCollage)
                } else break

            } else {
                finish = false
            }
        }
    }
    println("you choose name $nameEdit")
    println("you choose age $ageEdit")
    println("you choose game $gameEdit")
    println("you choose collage $collageEdit")
    println("you add data ? y/n")
    val answer = readLine()
    if (answer == "y") {
        println(" 1 add name ,2 add age ,3 add game,4 add collage ,when finished, write finish")
        var fin = true
        val answer2 = readLine()
        while (fin) {
            if (answer2 == "1") {
                println("enter data")
                val add = readLine().toString()
                if (add =="finish"){
                    fin=false
                }

                nameEdit.add(add)

            } else if (answer2 == "2") {
                println("enter data")
                val add = readLine().toString()
                if (add =="finish"){
                    fin=false
                }

                ageEdit.add(add)
                if (add =="finish"){
                    fin=false
                }

            } else if (answer2 == "3") {
                println("enter data")
                val add = readLine().toString()
                if (add =="finish"){
                    fin=false
                    break
                }

                gameEdit.add(add)
                if (add =="finish"){
                    fin=false
                    break
                }
            } else if (answer2 == "4") {
                println("enter data")
                val add = readLine().toString()
                if (add =="finish"){
                    fin=false
                    break
                }
                collageEdit.add(add)
                if (add =="finish"){
                    fin=false
                    break
                }
            } else if (answer2 == "finish") {
                fin = false
            }else break
        }
        when (answer2){
            "1" -> println("you add name $nameEdit")
            "2" -> println("you add age $ageEdit")
            "3" ->  println("you add game $gameEdit")
            "4" ->  println("you add collage $collageEdit")
        }


    }

}


