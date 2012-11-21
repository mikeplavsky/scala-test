case class Player(first:String,last:String)

var two = Player("Marry", "Jane")
println( two.first )

var one = Player(first="John", last="Mac")
one.last

def singleExpression: List[String] => (List[Int], List[Int]) = 
    {a => a map (_.toInt) partition (_ < 30)}

singleExpression( List("34","50", "20", "70" ))

case class Square(var side: Int) {
  def area = side * side
}

val a = Square(12)
a.area

val b = Square(5)
b.area
