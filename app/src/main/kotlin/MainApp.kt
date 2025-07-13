package org.abhishek.app

import org.abhishek.utils.Printer
import kotlin.concurrent.timer


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    val name = "Kotlin"
//    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//    // to see how IntelliJ IDEA suggests fixing it.
//    val message = "Hello, " + name + "!"
//    val printer = Printer(message)
//    printer.printMessage()
//
//    for (i in 1..5) {
//        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//        println("i = $i")
//    }
//    val dog: Dog = Yorkshire()
//    dog.sayHello()

    loopRange()



}

private operator fun Int.times(str : String) = str.repeat(this)

/**  Null Safety -> In Kotlin we can't assign null value in a variable,
 * If we want to store null value in variable then you should add spacial character (?).*/

fun nullPointerExceptionExplain(){
    val str = "First value"
    val str1 : String = "Second Value"
    var str2 : String = "Second Value"
    val str3 :String? = null

//    str2 = null  // Null Pointer Exception
}


/** Generics -> Generics allow you to write flexible, reusable code that works with different types, while keeping type safety.*/

// Generic Classes -> The first way to use generics in Kotlin is creating generic classes.

class  MutableStack<T>(vararg item : T){

    private val elements = item.toMutableList()

    // push
    fun push(el : T) = elements.add(el)

    // Peek
    fun peek(): T = elements.last()

    // Pop
    fun pop() = elements.removeAt(elements.size -1)

    // Is Empty
    fun isEmpty() = elements.isEmpty()

    // Size

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"

}

// Generic Functions -> A generic function is a function that works with any type — you don’t have to write separate functions for different types.

fun <T> getFirst(items : List<T>) : T {
    return items[0]
}

/** Inheritance -> Kotlin fully supports the traditional object-oriented inheritance mechanism.*/

open class Dog(){
    open fun sayHello(){
        println("WOW WOW!")
    }
}

class Yorkshire : Dog() {
    override fun sayHello(){
        println("Wif Wif!")
    }
}
/** When - > It is similar to switch, but it is more flexible with more express.  */
fun cases(obj: Any) {
    when (obj) {                                     // 1
        1 -> println("One")                          // 2
        "Hello" -> println("Greeting")               // 3
        is Long -> println("Long")                   // 4
        !is String -> println("Not a string")        // 5
        else -> println("Unknown")                   // 6
    }
}
// When Expression
fun whenAssign(obj: Any): Any {
    val result = when (obj) {                   // 1
        1 -> "one"                              // 2
        "Hello" -> 1                            // 3
        is Long -> false                        // 4
        else -> 42                              // 5
    }
    return result
}

/** Loops -> Kotlin supports all the commonly used loops: for, while, do-while. */

// For -> for in Kotlin works the same way as in most languages.
fun forLoopTest(){
    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {                               // 1
        println("Yummy, it's a $cake cake!")
    }

}

// Iterators -> You can define your own iterators in your classes by implementing the iterator operator in them.

class Animal(val name: String)

class Zoo(val animals: List<Animal> ){

    operator fun iterator() : Iterator<Animal>{
        return animals.iterator()
    }
}
/** Ranges -> There is a set of tools for defining ranges in Kotlin. Let's have a brief look at them.*/

fun loopRange(){
    for(i in 0..3) {             // 1
        print(i)
    }
    print(" ")

    for(i in 0 until 3) {        // 2
        print(i)
    }
    print(" ")

    for(i in 2..8 step 2) {      // 3
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0) {      // 4
        print(i)
    }
    print(" ")

}

/** Equality Checks -> Kotlin uses == for structural comparison and === for referential comparison. */

fun equalityChecks(){
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)   // 1
    println(authors === writers)  // 2
}

/** Conditional Expression -> There is no ternary operator condition ? then: else in Kotlin. Instead, if may be used as an expression. */
fun max(a: Int, b: Int) = if (a > b) a else b         // 1




