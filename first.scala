case class Player(first:String,last:String)

var two = Player("Marry", "Jane")
var one = Player(first="John", last="Mac")

def singleExpression: List[String] => (List[Int], List[Int]) = 
    {a => a map (_.toInt) partition (_ < 30)}

singleExpression( List("34","50", "20", "70" ))
