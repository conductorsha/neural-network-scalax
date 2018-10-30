import org.scalatest.FunSuite

import SquareMatrix._

class MainTest extends FunSuite{

  test("converting vector to row-oriented 2D matrix"){
    val v = Vector(1,2,3,4,5,6)
    val m = v.toMatrix2D(2, 3)
    assert(m.size == 2)
    assert(m(0) == Vector(1,2,3))
    assert(m(1) == Vector(4,5,6))
  }

}
