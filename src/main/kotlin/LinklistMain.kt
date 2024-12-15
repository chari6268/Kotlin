package com.chari

import com.chari.ds.LinkedListOperations
import com.chari.ds.Node

class LinklistMain {
    fun main(){
        val lm = LinkedListOperations()
        var head: Node? = null
        var n = readln().toInt()
        for (i in 0 until n) {
            head = lm.insertAtEnd(head, readln().toInt())
        }
        lm.display(head)
    }
}