import scala.collection.immutable.List

/**
 * Created by dihuibao on 1/11/14.
 */
object S99 extends App{

  val list = List(1, 1, 2, 3, 5, 8)
  // (1) Find the last element of a list
  def last = (l : List[Any]) => l.last
  println(last(list))

  // (2) Find the last but one element of a list.
  def penutimate = (l : List[Any]) => l.dropRight(1).last
  println(penutimate(list))


}
