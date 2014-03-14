import org.scalatest._

/**
 * @author tomerb
 * on 3/14/14.
 */
class Excercise1Test extends FlatSpec with ShouldMatchers {
  "fibonaci" should "return 6 for index 3 (0+1+2+3)" in {
      Excercise1.fibonacci(3) should equal(6)
  }

  it should "return 10 for index 4" in {
    Excercise1.fibonacci(4) should equal(10)
  }
}
