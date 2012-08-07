import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers._

class Homework1 extends FunSuite {

  test("can return a string") {
    Homework.foo should be ("foo")
  }

  test("can detect naughty words") {
    Homework.isNaughty("Optimus Prime loves cheese") should be (false)
    Homework.isNaughty("Megatron scoffs celery before destroying a galaxy") should be (true)
  }

  test("notice naughty word with different case") {
    Homework.isNaughty("Optimus Prime sneakily eats celery") should be (true)
  }

  test("only spot isolated naughty words") {
    Homework.isNaughty("I can't spell celeryiac") should be (false)
  }
}
