package priorityQueue

trait PriorityQueue[A, B] {
  val xs: Vector[(A, B)]
  def top(): (A, B)
  def peek(): (A, B)
  def insert(element: A, priority: B): PriorityQueue[A, B]
  def remove(element: (A, B)): PriorityQueue[A, B]
  def update(element: A, newPriority: B): PriorityQueue[A, B]
}
