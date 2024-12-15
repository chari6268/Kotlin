package com.chari

fun main() {
    val search = search()
    //array reading from user
    println("Enter the number of elements:")
    var n = readln().toInt()
    val arr = IntArray(n)
    println("Enter $n elements:")
    for (i in arr.indices) {
        arr[i] = readln().toInt()
    }

    // Array operations
    val arrayOperations = ArrayOperations()
    print("Enter the element to add: ")
    val temp = readln().toInt()
    print("Enter the position to add: ")
    val pos = readln().toInt()
    val newArr = arrayOperations.insertElement(arr, temp, pos)
    println("Array after adding element:")
    for (i in newArr) {
        print("$i ")
    }
    println()
    print("Enter the element to delete: ")
    val temp2 = readln().toInt()
    val newArr2 = arrayOperations.deleteElement(newArr, temp2)
    println("Array after deleting element:")
    for (i in newArr2) {
        print("$i ")
    }
    println()
//    val arr = intArrayOf(2, 3, 4, 10, 40)
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