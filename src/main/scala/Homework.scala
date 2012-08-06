object Homework {
  def foo = "foo"

  ////////////////////////////////////

  val naughtyWords = List("Celery", "Megatron")
  val caseInsensitiveWordPattern = """(?i)(^|\s)%s(\s|$)"""
  val naughtyPatterns = naughtyWords.map(caseInsensitiveWordPattern.format(_).r)
	
  // Note that use of isDefined is generally bad-style, but I can't see a better option here
  def isNaughty(text: String) = naughtyPatterns.exists(_.findFirstIn(text).isDefined)
}
