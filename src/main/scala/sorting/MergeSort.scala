package sorting

import scala.annotation.tailrec

object MergeSort {
  def mergeSort(xs: List[Int]): List[Int] = {
    if (xs.size <= 1) xs
    else {
      val left = xs take(xs.size / 2)
      val right = xs takeRight (xs.size / 2)
      merge(mergeSort(left), mergeSort(right))
    }
  }
  def merge(xs: List[Int], ys: List[Int]): List[Int] = {
    @tailrec
    def loop(A: List[Int], B: List[Int], C: List[Int]): List[Int] = {
      if (A.isEmpty & B.isEmpty) C
      else if (A.isEmpty) loop(A, B.tail, C :+ B.head)
      else if (B.isEmpty) loop(A.tail, B, C :+ A.head)
      else if (A.head <= B.head) loop(A.tail, B, C :+ A.head)
      else loop(A, B.tail, C :+ B.head)
    }

    loop(xs, ys, List())
  }

  def main(args: Array[String]): Unit = {
    val xs = List(1, 2, 4, 2, 3, 1, 5, 2)
    println(xs)
    println(mergeSort(xs))
  }
}
