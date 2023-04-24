package test
import org.scalatest.funsuite.AnyFunSuite
import uebung1.Rational

class RationalTest extends AnyFunSuite {

  test("Rational Inititalisation 1") {
    val x = new Rational(1,2)
    assert(x.value === 0.5)
  }
  
  test("Rational Inititalisation 2") {
    val x = new Rational(1,2)
    assertResult("1/2"){x.toString}
  }

  test("Test requirement (denominator!=0)"){
      intercept [IllegalArgumentException] {
        new Rational(1,0)}
  }

  test("Addition of two positive rationals") {
    val x = new Rational(1, 3)
    val y = x.add(new Rational(4, 2))
    assert(y.toString === "14/6")
  }

  test("Subtraction of two positive rationals") {
    val x = new Rational(5, 6)
    val y = x.sub(new Rational(2, 6))
    assert(y.toString === "18/36")
  }

  test("Negation of a positive rational") {
    val x = new Rational(1, 7)
    val y = x.neg
    assert(y.toString === "7/1")
  }

  test("Negation must not end with a denominator of 0") {
    val x = new Rational(0, 7)
    intercept [IllegalArgumentException] {
      x.neg
    }
  }
}
