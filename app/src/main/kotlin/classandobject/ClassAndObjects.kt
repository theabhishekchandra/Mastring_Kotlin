package org.abhishek.app.classandobject

class Base

class Derived


// Classes in Kotlin are declared using the keyword {class}:
class Person(val name: String, val age: Int)

// A class in Kotlin has a primary constructor and possibly one or more secondary constructors. The primary constructor is declared in the class header, and it goes after the class name and optional type parameters.

class Person2 constructor(val name: String, val age: Int)
// The class header can't contain any runnable code. If you want to run some code during object creation, use init blocks inside the class body.

// Secondary constructors -> A class can also declare secondary constructors, which are prefixed with constructor:

class Person3 constructor(val name: String, val age: Int){
    val myName: String = name
    val myAge: Int = age
    var myAddress = ""

    constructor (name :String, age: Int, address: String) : this(name = name, age = age) {
        myAddress = address
    }
}

// Creating instances of classes
val person = Person2(
    name = "John",
    age = 20,
)

