package org.abhishek.app.intro

import org.abhishek.app.basic.sum
import kotlin.math.sqrt

fun main() {

    /** Lambda Functions -> Lambda functions ("lambdas") are a simple way to create functions ad-hoc. Lambdas can be denoted very concisely in many cases thanks to type inference and the implicit it variable. */

    val upperCase1: (String) -> String = {
        str: String -> str.uppercase()
    }
    val upperCase2: (String) -> String = { str -> str.uppercase() }
    val upperCase3 = { str: String -> str.uppercase() }
    val upperCase5: (String) -> String = { it.uppercase() }
    val upperCase6: (String) -> String = String::uppercase

    val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water", 12.0F)))

    val withValue = 1
    val myFirstName  = "Abhishek"
    val myLastName = "Chandra"

    println(withValue.with(withValue))
    println(myFirstName.get(2))
//    println(calculator(1,2, ::sum)) // :: is the notation that references a function by name in Kotlin.
//    println(calculator(1,2){a,b -> a * b})
    println(operation())
    println(order.maxPricedItemValue())

}


// Infix Function -> Member functions and extensions with a single parameter can be turned into infix functions.
// A function with single parameter

infix fun Int.with(other: Int) = this + other
infix fun String.with(other: String) = this + " " + other

// Operator Functions -> Certain functions can be "upgraded" to operators, allowing their calls with the corresponding operator symbol.
operator fun String.get(range: IntRange) = substring(range)

/** Higher-Order Functions -> A higher-order function is a function that takes another function as parameter and/or returns a function.*/

fun calculator(a : Int, b : Int, operation: (Int, Int) -> Int) : Int = operation(a, b)

fun operation() : (Int) -> Int {
    return ::square
}
fun square(x: Int) = x * x

data class Item(val title: String, val price: Float)

data class Order(val items: Collection<Item>)

fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull { it.price }?.price ?: 0F


