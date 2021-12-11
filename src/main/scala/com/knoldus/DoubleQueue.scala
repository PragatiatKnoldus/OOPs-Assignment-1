package com.knoldus

class DoubleQueue extends Queue {

  def enqueue(list1: List[Int], element: Int): List[Int] = {
    val newList = list1:+element
    newList.map(_*2)
  }
}
