object scala_basic {
    def task1(word: String): String = {
    word.take(word.length() - 4) + word.drop(word.length() - 4).toUpperCase()
   }
   def main(args: Array[String]): Unit = {
      println(task1("Lech mistrz Polski"));
      println(task1("kks"));      
    }
  }