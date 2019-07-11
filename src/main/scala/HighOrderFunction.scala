object HighOrderFunction extends App {
  def sum(f :(Int,Int)=> Int,a: Int,b:Int): Int = f(a,b)

  val sumSquares = (a: Int,b: Int) => (a*a + b*b)
  val sumCubes = (a: Int,b: Int) => (a*a*a + b*b*b)
  val sumInts = (a: Int,b: Int) => (a+b)

  println(sum(sumSquares,5,4))
  println(sum(sumCubes,5,4))
  println(sum(sumInts,5,4))
}