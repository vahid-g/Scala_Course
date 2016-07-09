package patmat

import Huffman._

object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  Huffman.decodedSecret                           //> res0: List[Char] = List(h, u, f, f, m, a, n, e, s, t, c, o, o, l)
  val t1 = Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5)
                                                  //> t1  : patmat.Huffman.Fork = Fork(Leaf(a,2),Leaf(b,3),List(a, b),5)
  val l = "ab".toList                             //> l  : List[Char] = List(a, b)
  encode(t1)(l)                                   //> res1: List[patmat.Huffman.Bit] = List(0, 1)
	   
}