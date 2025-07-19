package org.abhishek.app.basic

import kotlin.apply


fun main() {

    val myName = Name(
        first = "Abhishek",
        last = "Chandra"
    )
    val myName0 = Name(
        first = "Abhishek",
        last = "Chandra"
    ).also {
        name ->
        name.last = "Java Is best"
    }
    val myName1 = Name(
        first = "Azad",
        last = "Chandra"
    ).run {
        first = ""
    }
    val myName2 = Name(
        first = "Azad",
        last = "Kumar"
    ).apply {
        last = ""
    }

    /** Declarations-> Destructuring Declarations in Kotlin allow you to unpack an object into multiple variables at once. Instead of accessing each property manually, you can decompose an object directly into separate variables.*/
    val (firstName, lastName) = myName
//    println(firstName)
//    println(lastName)

    /** Kotlin Delegated Properties -> Delegated properties let you delegate the getter/setter logic of a property to another object. It’s a powerful feature to reduce boilerplate and abstract behaviors like lazy loading, observable values, preferences, etc.*/

    val whoAreYou by lazy {
        println("Abhishek")
        "Abhishek Chandra"
    }
    println(whoAreYou)

}

class KotlinScope {

    /** | Function | Object Reference | Return Value      | Use Case                            |
    | -------- | ---------------- | ----------------- | ----------------------------------- |
    | `let`    | `it`             | Result of lambda  | Null check, transformations         |
    | `run`    | `this`           | Result of lambda  | Computations, configs, chaining     |
    | `apply`  | `this`           | The object itself | Object configuration (builders)     |
    | `also`   | `it`             | The object itself | Side-effects like logging/debugging |
    | `with`   | `this`           | Result of lambda  | Non-extension scoped block          |
     */

}


data class Name(var first: String?, var last: String?)

