package org.abhishek.app

import org.abhishek.utils.Printer
import kotlin.concurrent.timer


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    val message = "Hello, " + name + "!"
    val printer = Printer(message)
    printer.printMessage()

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
    val dog: Dog = Yorkshire()
    dog.sayHello()


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
