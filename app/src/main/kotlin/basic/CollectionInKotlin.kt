package org.abhishek.app.basic

class CollectionInKotlin {

    /** List -> A list is an ordered collection of items. In Kotlin, lists can be either mutable (MutableList) or read-only (List). For list creation, use the standard library functions listOf() for read-only lists and mutableListOf() for mutable lists. To prevent unwanted modifications, obtain read-only views of mutable lists by casting them to List.*/

    // MutableList
//    val systemInputs : MutableList<Int> = mutableListOf<Int>(1,2,3,4,5)
//
//    // Immutable (Read Only)
//    val sudoInputs : List<Int> = systemInputs
//
//    fun addNewSystemInputs(input : Int)  {
//        systemInputs.add(input)
//    }
//    fun getSystemInputs() : List<Int> {
//        return systemInputs
//    }

    /** Set -> A set is an unordered collection that does not support duplicates. For creating sets, there are functions setOf() and mutableSetOf(). A read-only view of a mutable set can be obtained by casting it to Set.*/

    // MutableSet
    val setOfData : MutableSet<Int> = mutableSetOf()

    // Immutable Set ( Read Only)
    val setOfInputData : Set<Int> = setOfData

    /** Map -> A map is a collection of key/value pairs, where each key is unique and is used to retrieve the corresponding value. For creating maps, there are functions mapOf() and mutableMapOf(). Using the to infix function makes initialization less noisy. A read-only view of a mutable map can be obtained by casting it to Map.*/

    val mapOfData : MutableMap<Int, String> = mutableMapOf(1 to "one", 2 to "two", 3 to "three")

    /** Filter Function -> filter function enables you to filter collections. It takes a filter predicate as a lambda-parameter. The predicate is applied to each element. Elements that make the predicate true are returned in the result collection.*/

    val number = listOf<Int>(-6,-5,-4,-3,-2,1,0,1,2,3,4,5,6,7,8,9)

    val positive = number.filter { item -> item > 0 }
    val negative = number.filter { it < 0}

    // Any Function -> If item contain at least one. Function any returns true if the collection contains at least one element that matches the given predicate.

    val atLeastOnePositive = number.any { it > 0 }
    val atLeastOneNegative = number.any { 0 < it }

    // All Function -> Function all returns true if all elements in collection match the given predicate.
    val allEven = number.all { it % 2 == 0 }            // 2

    val allLess6 = number.all { it < 6 }

    // Function none -> Function none returns true if there are no elements that match the given predicate in the collection.
    val allEven1 = number.none { it % 2 == 1 }           // 2

    val allLess7 = number.none { it > 6 }               // 3

    // TODO : More read  associateBy, groupBy.

    // associateBy — Creates a Map with unique keys
    // Groups elements into lists by key ( duplicates are Groups all matching items into a list)

    // partition -> The partition function splits the original collection into a pair of lists using a given predicate:
    //Elements for which the predicate is true.
    //Elements for which the predicate is false.
    val evenOdd = number.partition { it % 2 == 0 }           // 2
//    val (pos, neg) = number.partition { it > 0 } // 3

}
fun main() {

}