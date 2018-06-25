import scala.collection.mutable.ListBuffer
object ListOfList
{
  def main(a: Array[String])
  {
    var list1 = new ListBuffer[Int]()
    list1 += (1,2,3,4,5,6,7,8,9,0)
    //print list1
    println("List 1 : " + list1.toList)
    
    var list2 = new ListBuffer[Int]()
    list2 += (11,22,33,44,55,66,77,88,99,100)
    //print list2
    println("List 2 : " + list2.toList)    
    
    var list3 = new ListBuffer[Int]()
    list3 += (111,222,333,444,555,666,777,888,999,1000)
    //print list3
    println("List 3 : " + list3.toList)    
    
    var mainList = new ListBuffer[Any]()
    mainList += (list1.toList,list2.toList,list3.toList)
    //print mainList contain all three list
    println("MainList : " + mainList.toList)
    
    //print list1 as a string
    println("List 1 in type of String : " + list1.mkString)
    
    //print all element in list3 except last one
    println("Element in list3 except the last one : " + list3.init.toList)
  }
}