/**
 * @author Rathanak
 */

object Main
{
  def main(a: Array[String])
  {
    print("Enter the number of element to store in array1: ")
    var ele = scala.io.StdIn.readInt()
    
    var ar = new Array[Int](ele)
    var sum = 0
    for(i <- 0 until ele)
    {
      print("Element(" + i + "): ")
      ar(i) = scala.io.StdIn.readInt()
      sum += ar(i)
    }
    
    println("Sum of all elememt in array is: " + sum)
    
    /*Maximum element of Array*/
    var temp = ar(0)
    for(i <- 0 until ar.length)
    {
      if(temp < ar(i))
      {
        temp = ar(i)
      }
    }
    println("The max value of the element in array is : " + temp)
    //    println("The max value of the element in array is : " + ar.max)
    
    
    
    /*Array Concatenate*/
    var ar1 = Array(11, 12, 103, 56, 35)
    println("Element in array2:")
    ar1.foreach(element =>
      
      println("Element : " + element)
    )
    ar = ar ++ ar1
    println("Concatenate element of array1 and array2 : ")
    for(i <- 0 until ar.length)
    {
      println("Element : " + ar(i))
    }
  }
}