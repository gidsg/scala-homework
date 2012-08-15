import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers._

class Homework2 extends FunSuite {

  test("can use varargs") {
    Homework.modulo42(43, 63, 97) should be (Seq(1,21,13))
  }

  /*
  test("can use varargs with a collection") {
    Homework.modulo42(Seq(43, 63)) should be (Seq(1,21))  // Making the test compile is the object of the exercise
  }
  */

}
