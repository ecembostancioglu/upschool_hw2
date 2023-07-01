package com.example.homework_2

data class Person(val name: String)

fun main(){
    val people = arrayListOf(
        Person("Ecem"),
        Person("Mesut"),
        Person("Selin"),
        Person("Leyla"),
        Person("Nazlı")
    )

    println("Please enter 3 names seperated by commas: ")

    val input = readLine()

     if(!input.isNullOrEmpty()){
         val names=input.split(",").map {
             it.trim()
         }
         val newPerson = names.map { Person(it) }
         people.addAll(newPerson)
         println("Final List:")
         people.forEach { println(it.name.lowercase()) }
     }else{
         println("The list is empty!!")


     }

}