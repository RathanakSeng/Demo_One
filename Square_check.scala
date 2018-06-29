import scala.util.control.Breaks._
object Main 
{
  def main(a: Array[String])
  { 
    print("Enter a number: ")
    var num = scala.io.StdIn.readInt()
    print("Enter a guess square number of " + num + ": ")
    var chec = scala.io.StdIn.readInt()
    check(num, chec)
  }
  def check(num: Int, chec: Int)
  {
    var n = 0
    var ch = chec
    breakable
    {
      while(ch != (num*num))
      {
         if(ch == num)
         {
           println("Don't give number: " + num)
         }
         else if(ch >= (num*num)+5)
         {
            for(i <- 0 until (ch - (num*num)))
            {
              n = n - 1
            }
            println("Try to add: " + n)
         }
         else if(ch <= (num*num)-5)
         {
            for(i <- 0 until ((num*num) - ch))
            {
              n = n + 1
            }
            println("Try to add: " + n)
         }
         else
         {
           println("You nearly right...")
           break
         }
         n = 0
         print("Enter a guess square number of " + num + ": ")
         ch = scala.io.StdIn.readInt()
      }
    }
    if(ch == num*num)
      println("Congratulation!!!! you are right.")
  }
}