// Package definition and imports
package org.abhishek.app.basic

/** Print to the standard output */
//Program entry point
/*fun main(args: Array<String>) {

}*/
// or
fun main(){
    /** Print to the standard output */
    println("Hello, world! (with new line)") // Print all Statements in new line.
    print("Hello, world!") // Print all Statements in same line.

}


/** Functions */
fun syntaxOfFunction(){

}
fun sum(a: Int, b: Int): Int {
    return a + b
}
fun sum(a: Int, b: Int, c: Int) = a + b + c //A function body can be an expression. Its return type is inferred:

fun printSum(a: Int, b: Int): Unit { // A function that returns no meaningful value:
    println("sum of $a and $b is ${a + b}")
}
/** Creating classes and instances */
//class Shape // To define a class, use the class keyword
open class Shape // Classes are final by default; to make a class inheritable, mark it as open:

/*class Rectangle(val height: Double, val length: Double) { //Properties of a class can be listed in its declaration or body:
    val perimeter = (height + length) * 2
    // The default constructor with parameters listed in the class declaration is available automatically:

}*/
//Inheritance between classes is declared by a colon (:)
class Rectangle(val height: Double, val length: Double): Shape() {
    val perimeter = (height + length) * 2
}

/** Comments */

// Single line Comments
/* Multi-line Comments */

/** Conditional expressions */

//fun maxOf(a: Int, b: Int): Int {
//    if (a > b) {
//        return a
//    }else{
//        return b
//    }
// //Both are same but we can use as need.
//}
fun maxOf(a: Int, b: Int): Int = if (a > b) a else b





/** Print to the standard output */
/** Print to the standard output */
/** Print to the standard output */
