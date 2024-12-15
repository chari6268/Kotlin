package com.chari

import com.chari.ds.*

class LinklistMain {
    fun main(){
        try {
            val lm = LinkedListOperations()
            var head: Node? = null
            print("Enter the number of elements: ")
            val n = readln().toInt()
            for (i in 0 until n) {
                print("Enter the $i element: ")
                head = lm.insertAtEnd(head, readln().toInt())
            }
            lm.display(head)
            print("Enter the element to be inserted at the beginning: ")
            head = lm.insertAtBegin(head, readln().toInt())
            lm.display(head)
        } catch (e: Exception) {
            println(e.message)
        }
    }
}