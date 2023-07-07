package com.example.homework_2

fun main(){

    val names = arrayListOf("Sinem", "Ali", "Hümeyra", "Cem", "Gizem")

    names.sort()
    println(names)

    println("Please enter a name: ")

    val input = readLine()

    if(input!=null){
        if(names.contains(input)){
            val newName=input.uppercase().reversed()

            println("The reverse of the name: $newName")

        }else{
            println("The name you entered was not found in the list!")

        }
    }




}