package com.example.androidbootcamp2021_atul.excersise

//Create a list of Employee which will have name and age as properties. print the name of all employees age >30.

data class Employee(val name: String, val age: Int)
val employeeList = listOf(
    Employee("Atul", 25),
    Employee("Ankit", 35),
    Employee("Ram", 40),
    Employee("Shyam", 32),
    Employee("Steve", 24),
    Employee("Rogers", 44)
)
val agePredicate: (Employee) -> Boolean = { person: Employee -> person.age >30 }
