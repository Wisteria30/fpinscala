import org.scalatest.funsuite._
import fpinscala.datastructures._

class HelloSpec extends AnyFunSuite {
  test("Hello should start with H") {
    assert("Hello".startsWith("H"))
  }
}

class ListSpec extends AnyFunSuite {
  val listInt = List(1, 2, 3)
  val listDouble = List(1.0, 2.0, 3.0)
  val listString = List("one", "two", "three")

  test("tailメソッドは先頭の要素を削除する") {
    assert(List.tail(listInt) == List(2, 3))
    assert(List.tail(listDouble) == List(2.0, 3.0))
    assert(List.tail(listString) == List("two", "three"))
  }

  test("setHeadメソッドは先頭の要素を置き換える") {
    assert(List.setHead(listInt, 4) == List(4, 2, 3))
    assert(List.setHead(listDouble, 4) == List(4.0, 2.0, 3.0))
    assert(List.setHead(listString, "four") == List("four", "two", "three"))
  }
}