package main.scala.functionObjects

/**
 * Created by sirisha on 23/01/2017.
 */
object functionalObjectMain extends App{

  println("first main class");
  var rational = new Rational(3,4)
  println(rational)
  var rational2 = new Rational(2)
  println(rational2)
  println(rational2.gcd())

}
