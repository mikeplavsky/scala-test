type Pred[A] = A => Boolean
def less(x:Int,y:Int):Boolean = x < y

less(10, 12)

def not[A](p: Pred[A]):Pred[A] = a => !p(a)

val less5 = {less(_:Int, 5)}
val more5 = {not[Int](less5)(_)}

def less[A] = {_ < _}

