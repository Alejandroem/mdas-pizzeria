package kitchen.utilities

object SequenceUtils {
  def findElement[A](ls:Seq[A], valor:A): Seq[A] = {

    val index = ls.indexOf(valor)
    if(index < 0) ls
    else if (index == 0) {
      ls.tail
    }else{
      val (a,b) = ls.splitAt(index)
      a ++ b.tail
    }
  }
}
