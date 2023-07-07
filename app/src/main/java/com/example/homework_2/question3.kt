package com.example.homework_2

data class Student(val name: String, val age: Int, val school: String)

val students = arrayListOf(
    Student("Ahmet", 20, "Üniversite A"),
    Student("Ayşe", 27, "Üniversite B"),
    Student("Mehmet", 22, "Üniversite C"),
    Student("Fatma", 28, "Üniversite A"),
    Student("Ali", 29, "Üniversite B"),
    Student("Feyza", 24, "Üniversite A"),
    Student("Berkay", 22, "Üniversite B"),
    Student("Caner", 26, "Üniversite A")
)

fun main() {
    val maxAgeStudent = students.maxByOrNull { it.age }
    val minAgeStudent = students.minByOrNull { it.age }

    if (maxAgeStudent != null && minAgeStudent != null) {
        println("The oldest student: ${maxAgeStudent.name}, (${maxAgeStudent.age})")
        println("The youngest student: ${minAgeStudent.name}, (${minAgeStudent.age})")
    }

    val filteredStudents = students.filter { it.school == "Üniversite A" }

    val olderThan25 = filteredStudents.filter { it.age > 25 }
    val youngerThan25 = filteredStudents.filter { it.age < 25 }

    println("Students over 25:")
    olderThan25.forEach { println("${it.name}, (${it.age})") }

    println("Students younger than 25:")
    youngerThan25.forEach { println("${it.name}, (${it.age})") }
}