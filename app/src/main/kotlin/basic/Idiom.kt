package org.abhishek.app.basic

// Idiom -> Idiom means you patter , style that code write, and it makes programmer life easy.


/** Call multiple methods on an object instance (with)
 * */
class Turtle{
    fun penDown() {}
    fun penUp() {}
    fun turn(degrees: Double) {}
    fun forward(pixels: Double) {}

}

fun main() {
    val myTurtle = Turtle()
    with(myTurtle) { //draw a 100 pix square
        penDown()
        for (i in 1..4) {
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }
}
/** Configure properties of an object (apply) */
//val myRectangle = Rectangle().apply {
//    length = 4
//    breadth = 5
//    color = 0xFAFAFA
//}

/** Generic function that requires the generic type information*/