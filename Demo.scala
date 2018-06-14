object Demo 
{
  def main(a: Array[String]): Unit = 
  { 
    print("Enter a number : ")
    var num = scala.io.StdIn.readInt()
    println(num + "! is : " + fac(num))
  }
  def fac(num: Int): Long = 
  {
    if(num == 1)
      return 1
    else
      return (num * fac(num - 1))
  }
}