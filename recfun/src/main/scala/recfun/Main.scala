package recfun
import scala.math.ceil

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c / 2, r - 1) + pascal(ceil(c.toFloat / 2).toInt, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def cBalance(chars: List[Char], c: Int): Boolean = {
      if (chars.isEmpty) {
        if (c == 0) return true
        else return false
      }
      else {
        if (chars.head == '(') {
          return cBalance(chars.slice(1, chars.size), c + 1)
        } else if (chars.head == ')') {
          if (c > 0) return cBalance(chars.slice(1, chars.size), c - 1)
          else return false
        } else return cBalance(chars.slice(1, chars.size), c)
      }
    }
    return cBalance(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money < 0 || coins.isEmpty) return 0;
    if (money == 0) return 1;
    return countChange(money, coins.slice(1, coins.size)) + 
      countChange(money - coins.head, coins)
  }
}
