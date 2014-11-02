import scala.collection.immutable.List

/**
 * Created by dihuibao on 1/11/14.
 */
object S99 extends App{

  val list = List(1, 1, 2, 3, 5, 8)
  // (1) Find the last element of a list.
  def last = (l : List[_]) => l.last
  println(last(list))

  // (2) Find the last but one element of a list.
  def penutimate = (l : List[_]) => l.dropRight(1).last
  println(penutimate(list))

  // (3) Find the Kth element of a list.
  def nth = (n: Int, l : List[_]) => l.take(n+1).last
  println(nth(2, list))

  // (4) Find the number of elements of a list.
  def length = (l : List[_]) => l.length
  println(length(list))

  // (5) Reverse a list.
  def reverse = (l : List[_]) => l.reverse
  println(reverse(list))

  // (6) Find out whether a list is a palindrome.
  def isPalindrome = (l : List[Any]) => l.take(l.length/2) .equals(l.takeRight(l.length/2).reverse)
  println(isPalindrome(List(1, 2, 3, 2, 1)))

  // (7) Flatten a nested list structure.
  def flatten(l : List[_]) : List[_] = l match {
    case (head : List[_]) :: tail => flatten(head) ::: flatten(tail)
    case head :: tail => head :: flatten(tail)
    case Nil => Nil
  }
  println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))))

  // (8) Eliminate consecutive duplicates of list elements.
  def compress[T](l : List[T]) = l.tail.foldLeft(List[T](l.head))((ll:List[T], e) => ll.reverse match{
    case Nil => ll ::: List[T](e)
    case lll => if(lll.head.equals(e)) ll else ll ::: List[T](e)
  })
  println(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))

  // (9) Pack consecutive duplicates of list elements into sublists.
  //println(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
}
