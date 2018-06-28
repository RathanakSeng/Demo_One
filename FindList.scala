/**
 * @author Rathanak
 */
import scala.collection.mutable.ListBuffer
object FindList 
{
  def main(a: Array[String])
  {
    var set = new ListBuffer[String]()
    set += ("Alex", "Aloha", "Hola", "Bob")
    set.foreach((element: String) =>  
      element.toLowerCase().charAt(0) match
      {
        case 'a' =>
          if(element.length() == 4) println(element + " : Yes : Yes")
          else if(element.length() > 3) println(element + " : No : Yes")
          else println(element + " : No")
        case _ => 
          if(element.length() == 4) println("Yes : Yes")
          else if(element.length() > 3) println("No : Yes")
          else println("No")
      }
    )
  }
}