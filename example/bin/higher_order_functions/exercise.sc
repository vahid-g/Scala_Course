package higher_order_functions

object exercise {
  def product(f: Int => Int)(a: Int, b: Int) : Int = {
		if (a > b) 1
		else f(a) * product(f)(a + 1, b)
  }                                               //> product: (f: Int => Int)(a: Int, b: Int)Int
  product(x => x)(1, 5)                           //> res0: Int = 120
  
}