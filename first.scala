case class Player(first:String,last:String)

def singleExpression: List[String] => (List[Int], List[Int]) = 
    { a => a map (_.toInt) partition (_ < 30)}
