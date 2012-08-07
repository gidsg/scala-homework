object Homework {
  def foo = "foo"

  ////////////////////////////////////

  val naughtyWords = List("Celery", "Megatron")
  val wordBoundaryRegexPattern = """(?i)(^|\s)%s(\s|$)""" // The %s is for use with the printf style format method
  val naughtyPatterns = naughtyWords.map(wordBoundaryRegexPattern.format(_).r)

  // Note that use of isDefined is generally bad-style, but I can't see a better option here
  def isNaughty(text: String) = naughtyPatterns.exists(_.findFirstIn(text).isDefined)
}
