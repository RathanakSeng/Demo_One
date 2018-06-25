import scala.collection.mutable.ListBuffer
object Main 
{
  def main(a: Array[String])
  {
    var final_list = new ListBuffer[Int]()
    
    var list1 = new ListBuffer[Int]()
    list1 += (25, 17, 12)
    
    var list2 = new ListBuffer[Int]()
    list2 += (44, 2, 6, 11)
    
    var list = list1 ++ list2
    list = list.reverse
    
    for(i <- 0 until list.length if(list(i) % 2 == 1))
    {
       final_list += list(i)
    }
    list.foreach((element: Int) => print(element + " "))
    println()
    println("Reverse order and odd number list is: " + final_list.toList)
  }
}