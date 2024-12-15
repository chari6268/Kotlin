package com.chari.ds

class Node(var data: Int) {
    var next: Node? = null
}
class LinkedListOperations {
    fun insertAtBeginning(head: Node?, data: Int): Node {
        val newNode = Node(data)
        newNode.next = head
        return newNode
    }

    fun insertAtEnd(head: Node?, data: Int): Node {
        val newNode = Node(data)
        if (head == null) {
            return newNode
        }
        var temp = head
        while (temp?.next != null) {
            temp = temp.next
        }
        temp?.next = newNode
        return head
    }

    fun insertAtPosition(head: Node?, data: Int, pos: Int): Node? {
        val newNode = Node(data)
        if (pos == 1) {
            newNode.next = head
            return newNode
        }
        var temp = head
        for (i in 1 until pos - 1) {
            temp = temp?.next
        }
        if (temp == null) {
            return head
        }
        newNode.next = temp.next
        temp.next = newNode
        return head
    }

    fun deleteAtBeginning(head: Node?): Node? {
        return head?.next
    }

    fun deleteAtEnd(head: Node?): Node? {
        if (head?.next == null) {
            return null
        }
        var temp = head
        while (temp?.next?.next != null) {
            temp = temp.next
        }
        temp?.next = null
        return head
    }

    fun deleteAtPosition(head: Node?, pos: Int): Node? {
        if (pos == 1) {
            return head?.next
        }
        var temp = head
        for (i in 1 until pos - 1) {
            temp = temp?.next
        }
        if (temp?.next == null) {
            return head
        }
        temp.next = temp.next?.next
        return head
    }

    fun display(head: Node?) {
        var temp = head
        while (temp != null) {
            print("${temp.data} ")
            temp = temp.next
        }
        println()
    }
}