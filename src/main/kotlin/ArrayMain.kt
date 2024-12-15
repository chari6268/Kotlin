package com.chari

import com.chari.DS.ArrayOperations
import com.chari.DS.search

class ArrayMain {
    fun main() {
        val arr = intArrayOf(1, 2, 3, 4, 5)
        val search = search()
        val ao = ArrayOperations()
        val x = 3
        val pos = 2
        val newArr = ao.insertElement(arr, x, pos)
        println("Array after inserting $x at position $pos:")
        for (i in newArr) {
            print("$i ")
        }
        println()
        val pos3 = 3
        val newArr2 = ao.deleteElement(newArr, pos3)
        println("Array after deleting element at position $pos3:")
        for (i in newArr2) {
            print("$i ")
        }
        println()
        val pos1 = search.BinariSearch(arr, x)
        if (pos1 != -1) {
            println("Element $x found at position $pos1")
        } else {
            println("Element $x not found")
        }
        val pos2 = search.LinearSearch(arr, x)
        if (pos2 != -1) {
            println("Element $x found at position $pos2")
        } else {
            println("Element $x not found")
        }
    }
}