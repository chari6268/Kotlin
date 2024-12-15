package com.chari.DS

class search {
    fun BinariSearch(arr: IntArray, x: Int): Int {
        var l = 0
        var r = arr.size - 1
        while (l <= r) {
            val m = l + (r - l) / 2
            if (arr[m] == x) return m
            if (arr[m] < x) l = m + 1
            else r = m - 1
        }
        return -1
    }
    fun LinearSearch(arr: IntArray, x: Int): Int {
        for (i in arr.indices) {
            if (arr[i] == x) return i
        }
        return -1
    }
}