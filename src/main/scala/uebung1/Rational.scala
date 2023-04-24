package uebung1

class Rational (val numerator:Int, val denominator:Int){

  def this (denom:Int) = this(1,denom)  
  override def toString:String = s"$num/$denom"
  
  require (denominator!=0,"Denominator mmuss != 0 sein")

  def num:Int=numerator
  def denom:Int= denominator
  def value:Double = (num.toDouble / denom)

  def  max(x:Rational): Rational = {
    
    if (numerator/denominator<x.num/x.denom) this else x
  }

  def add(x:Rational): Rational = {
    new Rational(this.num * x.denom + this.denom * x.num, this.denom * x.denom)
  }
  def sub(x:Rational): Rational = {
    new Rational(this.num * x.denom - this.denom * x.num, this.denom * x.denom)
  }

  def neg:Rational = {
    require(num != 0, "Denominator darf nicht 0 werden!")
    new Rational(this.denom, this.num)
  }
}

