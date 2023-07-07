package com.example.homework_2

data class Workers(val name: String, var salary: Double)

val workers = arrayListOf(
    Workers("Ahmet Yılmaz", 15000.0),
    Workers("Ayşe Kaya", 32000.0),
    Workers("Mehmet Demir", 29000.0),
    Workers("Fatma Şahin", 18500.0)
)

fun main() {
    workers.forEach { worker ->
        val increasedSalary = worker.salary * 1.35
        worker.salary = increasedSalary
    }

    workers.shuffle()
    workers.sortBy { it.salary }

    val lowestSalaryWorker = workers.first()
    val highestSalaryWorker = workers.last()
    println("Lowest paid worker: ${lowestSalaryWorker.name}, Salary: ${lowestSalaryWorker.salary}")
    println("Highest paid worker: ${highestSalaryWorker.name}, Salary: ${highestSalaryWorker.salary}")

    val totalSalary = workers.sumOf { it.salary }
    val averageSalary = totalSalary / workers.size
    println("Average Salary: $averageSalary")
}
