case class Player(first:String,last:String)

var two = Player("Marry", "Jane")
println( two first )

var one = Player(first="John", last="Mac")
one last

def singleExpression: List[String] => (List[Int], List[Int]) = 
    {a => a map (_.toInt) partition (_ < 30)}

singleExpression( List("34","50", "20", "70" ))

trait Maker {
  def make = ""
  def make_i(i:String) = i
}

case class Square(var side: Int) extends Maker {
  def area = side * side
}

val a = Square(12)
a area
a make

val b = Square(5)
b area

trait CheckIt extends Maker {
  override def make = "Done"
}

var p = new Square(5) with CheckIt
p make
p make_i "Nicely done!"

var l = 10::20::5::Nil
def sqrt(x:Int) = x*x
l map { sqrt _ }
l map { x => x*x }

