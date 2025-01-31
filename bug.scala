```scala
class MyClass[T](val value: T) {
  def printValue(): Unit = {
    println(value)
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val myInt = new MyClass(10)
    myInt.printValue() // Works fine

    val myString = new MyClass("Hello")
    myString.printValue() // Works fine

    val myList = new MyClass(List(1, 2, 3))
    myList.printValue() // Works fine
    
    val myNull = new MyClass(null)
    myNull.printValue()
  }
}
```