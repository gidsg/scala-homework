object Homework {


  def foo = "foo"

  ////////////////////////////////////

  val naughtyWords = List("Celery", "Megatron")
  val wordBoundaryRegexPattern = """\s"""


  def isNaughty(text: String) : Boolean ={
    val naughtyWordsLowerCase=naughtyWords.map(nW => nW.toLowerCase())
    val words= text.toLowerCase().split(wordBoundaryRegexPattern).toList
    naughtyWordsLowerCase.exists(words.contains)
  }


 
}