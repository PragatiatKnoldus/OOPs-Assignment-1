package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class DoubleQueueTest extends AnyFlatSpec{
  val doubleQueue = new DoubleQueue

  "DoubleQueue" should "return correct output when enqueue" in {
    val list1 = List(1,2,3)
    val element = 7
    val expected = List(2,4,6,14)
    val res = doubleQueue.enqueue(list1, element)
    assertResult(expected)(res)
  }
  "It" should "return only enqueue elements" in {
    val list1 = List()
    val element = 4
    val expected = List(8)
    val res = doubleQueue.enqueue(list1, element)
    assertResult(expected)(res)
  }
  "It" should "return the correct output when dequeue elements" in {
    val list1 = List(5,4,3,2)
    val expected = List(4,3,2)
    val res = doubleQueue.dequeue(list1)
    assertResult(expected)(res)
  }
  "It" should "return blank list when dequeue and list is empty" in {
    val list1 = List()
    val expected = List()
    val res = doubleQueue.dequeue(list1)
    assertResult(expected)(res)
  }
  "It" should "return blank list when dequeue " in {
    val list1 = List(1)
    val expected = List()
    val res = doubleQueue.dequeue(list1)
    assertResult(expected)(res)
  }
}