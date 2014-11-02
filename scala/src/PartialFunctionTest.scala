/**
 * Created by dihuibao on 2/11/14.
 */
object PartialFunctionTest extends App{

  val list = List(41, 100)
  val list2 = List(41, 'a, 100)

  println(list map {a :Int => a + 1})
  println(list2 collect {case a:Int => a+1})

  println(list(1))
  println(list.lift(3)) // None

  println(list.isDefinedAt(0)) // true
  println(list.isDefinedAt(3)) // false

  //List acts as a PartialFunction
  println(Seq(0, 1, 10) collect list) //List(41, 100)
}
