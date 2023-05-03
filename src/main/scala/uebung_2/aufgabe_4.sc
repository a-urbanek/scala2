import scala.annotation.tailrec

@tailrec
def squareUnder(x:Double, max:Double):Double = {
  if ((x * x) < max) squareUnder(x * x, max)
  else x
}

squareUnder(2, 10)
squareUnder(6, 50)
squareUnder(3, 10)
