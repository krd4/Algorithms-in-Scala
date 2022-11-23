package priorityQueue

class Heap[A, B <% Ordered[B]] extends PriorityQueue[A, B] {
  val xs = Vector[(A, B)]()

  override def top(): (A, B) = ???

  override def peek(): (A, B) = xs(0)

  override def insert(element: A, priority: B): PriorityQueue[A, B] = ???

  override def remove(element: (A, B)): PriorityQueue[A, B] = ???

  override def update(element: A, newPriority: B): PriorityQueue[A, B] = ???

  private def getParentIndex(index: Int): Int = index / 2
  private def getHighestPriorityChildIndex(index: Int): Int = {
    if (index * 2 > xs.size - 1) index
    else if (index * 2 == xs.size - 1) index * 2
    else {
      if(xs(index * 2)._2 > xs(index * 2 + 1)._2) index * 2
      else index * 2 + 1
    }
  }
}
