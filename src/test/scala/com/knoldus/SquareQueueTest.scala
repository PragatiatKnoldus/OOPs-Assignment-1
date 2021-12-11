package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class SquareQueueTest extends AnyFlatSpec{
  val squareQueue = new SquareQueue

  "SquareQueue" should "return correct output when enqueue" in {
    val list1 = List(4,7,3)
    val element = 9
    val expected = List(16,49,9,81)
    val res = squareQueue.enqueue(list1, element)
    assertResult(expected)(res)
  }
  "It" should "return only enqueue elements" in {
    val list1 = List()
    val element = 6
    val expected = List(36)
    val res = squareQueue.enqueue(list1, element)
    assertResult(expected)(res)
  }
  "It" should "return the correct output when dequeue elements" in {
    val list1 = List(9,8,7,6)
    val expected = List(8,7,6)
    val res = squareQueue.dequeue(list1)
    assertResult(expected)(res)
  }
  "It" should "return blank list when dequeue and list is empty" in {
    val list1 = List()
    val expected = List()
    val res = squareQueue.dequeue(list1)
    assertResult(expected)(res)
  }
  "It" should "return blank list when dequeue " in {
    val list1 = List(7)
    val expected = List()
    val res = squareQueue.dequeue(list1)
    assertResult(expected)(res)
  }

}