type Pred[A] = A => Boolean
def less(x:Int,y:Int):Boolean = x < y

less(10, 12)

def not[A](p: Pred[A]):Pred[A] = a => !p(a)

val less5 = {less(_:Int, 5)}
val more5 = {not[Int](less5)(_)}

def curry[A,B,C](f: (A,B) => C): A => B => C = {x:A => {f(x,_)}}
def uncurry[A,B,C](f: A=>B=>C): (A,B)=>C = {(x:A,y:B) => f(x)(y)}
