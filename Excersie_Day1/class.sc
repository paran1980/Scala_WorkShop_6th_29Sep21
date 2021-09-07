//Create a class to calculate the simple intrest using a method call
// calculateSimpleIntrest having two parameters principle , rate for one year.
//class

class Interest {
    def calculateSimpleInterest(principle:Float,rate : Float)={
    val year =1
    (principle * year * rate ) /100
  }
}

new Interest().calculateSimpleInterest(10000,7.75f)

//Create a class where constructors takes a parameter as number
// and calculate thecube in calculateCube
class Cube(value:Float){
  def calculateCube:Double=Math.pow(value,3)
}
new Cube(5).calculateCube

object Person{
  def apply():Person ={
    println("Instantiating Person using apply")
    new Person
  }
}
case class Person private()
Person()

//Create a single object with HelloWorld
object HelloWorld
HelloWorld
