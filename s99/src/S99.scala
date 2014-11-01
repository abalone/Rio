import scala.collection.immutable.List

/**
 * Created by dihuibao on 1/11/14.
 */
object S99 extends App{

  val list = List(1, 1, 2, 3, 5, 8)
  // (1) Find the last element of a list.
  def last = (l : List[Any]) => l.last
  println(last(list))

  // (2) Find the last but one element of a list.
  def penutimate = (l : List[Any]) => l.dropRight(1).last
  println(penutimate(list))

  // (3) Find the Kth element of a list.
  def nth = (n: Int, l : List[Any]) => l.take(n+1).last
  println(nth(2, list))

  // (4) Find the number of elements of a list.
  def length = (l : List[Any]) => l.length
  println(length(list))

  // (5) Reverse a list.
  def reverse = (l : List[Any]) => l.reverse
  println(reverse(list))

  // (6) Find out whether a list is a palindrome.
  def isPalindrome = (l : List[Any]) => l.take(l.length/2) .equals(l.takeRight(l.length/2).reverse)
  println(isPalindrome(List(1, 2, 3, 2, 1)))
}
