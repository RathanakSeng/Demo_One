import scala.collection.mutable.ListBuffer
import scala.io.StdIn
object Input {
  def main(a: Array[String])
  {
    var list = new ListBuffer[String]()
    println("Enter 2 element : ")
    for(i <- 1 to 2)
    {
      var str = readLine()
      list += str
    }
    println(list)
    var t = "MoonLight" :: list.toList
    println(t)
  }
}