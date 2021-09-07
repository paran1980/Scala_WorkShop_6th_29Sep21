//1. Write a function that computes the area of a circle given its radius.
def areaOFCircle(radius:Float):Float= f"${Math.PI * radius * radius}%.5f".toFloat
areaOFCircle(10.5f)

//2.Write a function that computes the area of a circle given its circumference.
// Solve using Nested function.
def areaOFCircleCircumference(circumference:Double):Double= {
  //formula: Aread = c2 / 4*pi
  def computeAreaOFCircle(c:Double):Double=f"${(c* c)/(4*Math.PI)}%.5f".toDouble
  computeAreaOFCircle(circumference)
}
areaOFCircleCircumference(20.25)

//Write a function that that that takes integers , that can vary in count and generate xor value of all of those.
// Write function with and without using acollection.
import scala.annotation.tailrec
def generateXORValue(values:List[Int]):Int={
    @tailrec
    def xorCalculate(v:List[Int],acc:Int):Int={
      v match {
        case Nil => acc
        case head::tail => xorCalculate(tail,acc ^ head)
      }
    }
  xorCalculate(values,0)

}
generateXORValue(List(3,9,12,13,15))

//4. Write a function called multiplier that takes two parameters, first as Int,
// andother of Function type(Int)=>Int. This multiplies the Int value with result ofthe function.Create 2 anonymous functions incremeter( which increments its value by1) and squared(which gives square of number). Now the problem will behow we can input another Integer for the function multiplier.
// The returntype of multiplier has not been provided. So try to create your own way.

val incrementer: Int => Int = (_:Int) + 1
val squared  = (x:Int) => Math.pow(x,2).toInt
def multiplier(value:Int, func: Int => Int) = value * func(_:Int)
val multiplyIncrementer = multiplier(10,incrementer)
val multiplySquared= multiplier(value = 5, squared)
multiplyIncrementer(4)
multiplySquared(3)








