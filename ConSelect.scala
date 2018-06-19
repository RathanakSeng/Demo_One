object ConSelect 
{
  def main(a: Array[String])
  {
    var vowel = 0
    var Con = ""
    var set = scala.collection.mutable.LinkedHashSet[Char]()
    print("Enter any string : ")
    var str = scala.io.StdIn.readLine()
    var s = str.toLowerCase()
    for(i <- 0 until s.length())
    {
      set += s.charAt(i)
    }
    for(s <- set)
    {
      if(s >= 'A' && s <= 'Z' || (s >= 'a' && s <= 'z'))
      {
        s match
        {
          case 'a' => vowel = vowel + 1
          case 'e' => vowel = vowel + 1
          case 'i' => vowel = vowel + 1
          case 'o' => vowel = vowel + 1
          case 'u' => vowel = vowel + 1
          case _ => Con = Con + s + " "
        }
      }
    }
    println("The Consanent : " + Con)
    println("Vowels : " + vowel)
  }
}