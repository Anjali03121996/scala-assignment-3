import scala.math.sqrt

class HighOrderFn {
  def area(shape: String,first: Int,second: Int, f: (Int,Int) => Int): Int={
    f(first,second)
  }

  val areaRectangle = (first : Int,second : Int) => (first*second)
  val areaRhombus = (first : Int,second : Int) => ((first*second)/2)
  val areaParallelogram = (first : Int,second : Int) => (first*second)
}
object HighOrderFn extends App {
  val obj = new HighOrderFn
val shape : String="rhombus"
shape match {
  case "rectangle" => println(obj.area(s"$shape",5,4,obj.areaRectangle))
  case "rhombus" => println(obj.area(s"$shape",5,4,obj.areaRhombus))
  case "parallelogram" => println(obj.area(s"$shape",5,4,obj.areaParallelogram))
  case default => println("No matching shapes")
}


}
