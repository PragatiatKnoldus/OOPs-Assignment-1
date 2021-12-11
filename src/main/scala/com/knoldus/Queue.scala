package com.knoldus

trait Queue {

  def enqueue (list1 : List[Int],element:Int): List[Int]

  def dequeue (list1 : List[Int]): List[Int] = {
      list1.drop(1)
  }
}
