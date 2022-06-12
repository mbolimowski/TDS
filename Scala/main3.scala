object Scala_String {
  def task3(word: String, sub1: String, sub2:String): Boolean = {
  var l = word.length;
  var sub1_count = 0;
  var sub2_count = 0;
  for (i <- 0 to l-1) 
  {
    if (i < (l - sub1.length + 1)) 
	{
      var tmp = word.substring(i,i+sub1.length);
      if (tmp.equals(sub1))
        sub1_count = sub1_count +1;
    }
    if (i < (l - sub2.length + 1)) 
	{
      var tmp2 = word.substring(i,i+sub2.length);
      if (tmp2.equals(sub2))
        sub2_count = sub2_count + 1;
    }
  }
  if (sub1_count == sub2_count)
    return true;
  else
    return false;
  }
  def main(args: Array[String]): Unit = {
      var str1 =  "maksmaksmaksmaks";
      println(task3(str1, "maks", "smak"));
      str1 =  "maksmaksmaksmaksmak";
      println(task3(str1, "maks", "smak"));
  }
}
