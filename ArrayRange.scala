/**
 * @author Rathanak
 */

object ArrayRange 
{
  def main(a: Array[String])
  {
    var ar = Range(1,101)
    for(i <- ar)
    {
      if(i%15==0)
        println("FooBar")
      else if(i%5==0)
        println("Bar")
      else if(i%3==0)
        println("Foo")
      else
        println(i)
    }
  }
}