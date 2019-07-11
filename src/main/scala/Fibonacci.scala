object Fibonacci extends App {
  fibo(7)
  def fibo(n: Int) = {
    def fiboRecursion(n: Int, first: Int = 0, second: Int = 1): Int = {
      if (n == 0) first
      else {
        print(" " + first)
        fiboRecursion(n - 1, second, second + first)
      }
    }
    fiboRecursion(n)
  }
}
