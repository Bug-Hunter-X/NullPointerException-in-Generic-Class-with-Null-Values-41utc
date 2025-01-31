```scala
class MyClass[T](val value: Option[T]) {
  def printValue(): Unit = {
    value match {
      case Some(v) => println(v)
      case None => println("Value is null")
    }
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val myInt = new MyClass(Some(10))
    myInt.printValue() // Prints 10

    val myString = new MyClass(Some("Hello"))
    myString.printValue() // Prints Hello

    val myList = new MyClass(Some(List(1, 2, 3)))
    myList.printValue() // Prints List(1, 2, 3)

    val myNull = new MyClass(None)
    myNull.printValue() // Prints "Value is null"
  }
}
```