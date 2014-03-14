import scala.annotation.tailrec

/**
 * @author tomerb
 * on 3/14/14.
 */
object Excercise1 {

  def fibonacci(n: Integer) = {

    @tailrec
    def go(i: Int, max: Int, acc: Int): Int = {
      i match {
        case x if x > max => acc
        case x => go(i + 1, max, acc + i)
      }
    }

    go(0, n, 0)
  }
}
