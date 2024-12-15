package com.chari.ds

class LinkedListOperations {
    fun insertAtEnd(head: Node?, data: Int): Node {
        val newNode = Node(data)
        if (head == null) {
            return newNode
        }
        var current = head
        while (current?.next != null) {
            current = current.next!!
        }
        current?.next = newNode
        return head
    }

    fun display(head: Node?) {
        var current = head
        while (current != null) {
            print("${current.data} ")
            current = current.next
        }
        println()
    }
    fun insertAtBegin(head: Node?, data: Int): Node {
        val newNode = Node(data)
        newNode.next = head
        return newNode
    }
}