package org.abhishek.app.intro

fun main() {
    val withValue = 1
    val myFirstName  = "Abhishek"
    val myLastName = "Chandra"

    println(withValue.with(withValue))
    println(myFirstName.get(2))
    println(withValue.with(withValue))

}


// Infix Function -> Member functions and extensions with a single parameter can be turned into infix functions.
// A function with single parameter

infix fun Int.with(other: Int) = this + other
infix fun String.with(other: String) = this + " " + other

// Operator Functions -> Certain functions can be "upgraded" to operators, allowing their calls with the corresponding operator symbol.
operator fun String.get(range: IntRange) = substring(range)
