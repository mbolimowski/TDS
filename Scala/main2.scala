object Scala_Array {
  def task2(nums: Array[Int], x:Int): Array[Int] = {
		var min = Integer.MAX_VALUE;
    var sum = 0;
		var prev = 0;
    var result = new Array[Int](3)
		for ( i<- 0 to nums.length-1)
		{
			sum += nums(i);

			if (i + 1 >= x)
			{
				if (min > sum)
				{
					min = sum 
					prev = i;
				}

				sum -= nums(i + 1 - x);
			}
		}
		result(0) = prev - x + 1;
		result(1) = prev;
		result(2) = min;
    result;
  }

  def main(args: Array[String]): Unit = {
    val nums = Array(1, 11, 3, 4, 5, 6, 7, 8, 9,10);
    val x =4;
    val result = task2(nums, x);
    println(s"\n${result(0)} to ${result(1)}, sum: ${result(2)}");  
  }
}
