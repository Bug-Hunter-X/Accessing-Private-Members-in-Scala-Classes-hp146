```scala
class MyClass(val name: String) {
  private var privateVar = 0

  def updatePrivateVar(newValue: Int): Unit = {
    privateVar = newValue
  }

  def getPrivateVar(): Int = {
    privateVar
  }
}

object Main extends App{
  val obj = new MyClass("Test")
  println(obj.getPrivateVar())  //Prints 0
  obj.updatePrivateVar(10)
  println(obj.getPrivateVar())  //Prints 10
}
```