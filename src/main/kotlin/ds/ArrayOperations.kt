package com.chari.DS

class ArrayOperations {
    fun deleteElement(arr: IntArray, x: Int): IntArray {
        val n = arr.size
        if (n == 0) {
            return arr
        }
        val newArr = IntArray(n - 1)
        var i = 0
        var j = 0
        while (i < n) {
            if (arr[i] == x) {
                i++
                continue
            }
            newArr[j] = arr[i]
            i++
            j++
        }
        return newArr
    }
    fun insertElement(arr: IntArray, x: Int, pos: Int): IntArray {
        val n = arr.size
        val newArr = IntArray(n + 1)
        var i = 0
        var j = 0
        while (i < n + 1) {
            if (i == pos) {
                newArr[i] = x
                i++
                continue
            }
            newArr[i] = arr[j]
            i++
            j++
        }
        return newArr
    }
    fun updateElement(arr: IntArray, x: Int, pos: Int): IntArray {
        val n = arr.size
        if (n == 0) {
            return arr
        }
        val newArr = IntArray(n)
        var i = 0
        var j = 0
        while (i < n) {
            if (i == pos) {
                newArr[i] = x
                i++
                j++
                continue
            }
            newArr[i] = arr[j]
            i++
            j++
        }
        return newArr
    }
}