```scala
case class MyClass(name: String, privateVar: Int = 0) {
  def updatePrivateVar(newValue: Int): MyClass = {
    this.copy(privateVar = newValue)
  }
  def getPrivateVar(): Int = privateVar
}

object Main extends App{
  var obj = MyClass("Test")
  println(obj.getPrivateVar())  //Prints 0
  obj = obj.updatePrivateVar(10)
  println(obj.getPrivateVar())  //Prints 10
}
```