

object Greater_score 
{
  def main(a: Array[String])
  {
    var ar:Array[Int] = new Array[Int](4)
    var arr:Array[Int] = new Array[Int](4)
      println("Enter the score of Alice")
      for(i <- 0 until ar.length)
      {
        print("Subject " + (i+1) + " : ")
        ar(i) = scala.io.StdIn.readInt()
      }
      println("Enter the score of Bob")
      for(i <- 0 until ar.length)
      {
        print("Subject " + (i+1) + " : ")
        arr(i) = scala.io.StdIn.readInt()
      }
      for(i <- 0 until ar.length)
      {
        if(ar(i) != arr(i) )
        {
          print(1 + " ")
        }
      }
  }
}