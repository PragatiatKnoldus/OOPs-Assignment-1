package com.knoldus

class SquareQueue extends Queue {

  def enqueue(list1: List[Int], element: Int): List[Int] = {
    val newList = list1:+element
    newList.map(x=>x*x)
  }
}
