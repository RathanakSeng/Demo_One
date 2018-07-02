/**
 * @author Rathanak
 */
object TupleDemo 
{
  def main(a: Array[String])
  {
    var sumInt = 0
    var sumFloat = 0.0f
    var tuple = ("Rathanak", 123, 9.0f, "Panha", 100, 3.14f, "Moonlight", 111, 6.34f)
    tuple.productIterator.foreach(element =>
      element match
      {
        case ele : Int => sumInt += ele
        case ele : Float => sumFloat += ele
        case ele : String => println(ele)
      }
    )
    println("Sum of integer variable in this tuple is: " + sumInt)
    println("Sum of float varible in this tuple is: " + sumFloat)
  }
}