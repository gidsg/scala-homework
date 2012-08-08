object Homework {
  def foo = "foo"

  ////////////////////////////////////

  val naughtyWords = List("Celery", "Megatron")
  val wordBoundaryRegexPattern = """(?i)(^|\s)%s(\s|$)""" // The %s is for use with the printf style format method

  def isNaughty(text: String) = false

  def modulo42(ints: Int*) = Seq()
}
