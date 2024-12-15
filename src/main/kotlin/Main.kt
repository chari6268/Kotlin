package com.chari

fun main() {
    val search = search()
    val arr = intArrayOf(2, 3, 4, 10, 40)
    val x = 10
    val result = search.BinariSearch(arr, x)
    if (result == -1) {
        println("Element not present in array")
    } else {
        println("Element found at index $result")
    }
    val result2 = search.LinearSearch(arr, x)
    if (result2 == -1) {
        println("Element not present in array")
    } else {
        println("Element found at index $result2")
    }
}