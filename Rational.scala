package main.scala.functionObjects

/**
 * Created by sirisha on 23/01/2017.
 */
// class takes parameters : class parameters in scala instead of constructor
class Rational(n: Int, d: Int) {
  //Any code placed in the class body (outside methods) will be placed in the primary constructor. When declaring a class you can drop empty {}
  val testString = "helloString"
  println(testString)
  // preconditions help create appropriate objects
  require(d!= 0)
  override def toString ="class paramters are: "+n +" and "+d
  // auxillary constructor
  //every auxiliary constructor must invoke another constructor of the same class
  //every auxiliary constructor must invoke another constructor of the same class
  def this(n: Int)= this(n,1)
  //method overload same as java
  def gcd():Int = gcd(n,d)
  def gcd(a:Int, b:Int): Int = if(b ==0) a else gcd(b, a%b)

  private var gcdValue = gcd(n,d)

  // methods of class
  def +(that: Rational): Rational = new Rational(n * that.d + that.n * d, d * that.d)

}
