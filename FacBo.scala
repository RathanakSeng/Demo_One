object FacBo 
{
  def main(a: Array[String]): Unit = 
  {
    print("Enter any number : ")
    var num = scala.io.StdIn.readInt()
    print("The facbonacci number " + num + " digits is : " + facb(num))
  }
  def facb(num: Int): String =
  {
    var i = num
    var first = 0 
    var second = 1 
    var sum = 0
    var str = first + " " + second + " "
    while(i > 2)
    {
      sum = first + second
      first = second
      second = sum
      str = str + sum + " "
      i = i - 1
    }
    return str
  }
}