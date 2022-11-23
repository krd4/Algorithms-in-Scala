import org.scalatest.funsuite.AnyFunSuite
import priorityQueue.Heap

class HeapSuite extends AnyFunSuite {
  test("top() should return a item with highest priority and remove it") {
    val heap = new Heap[String, Int]();
    heap.insert("a", 1)
    heap.insert("b", 2)
    heap.insert("c", 3)

    assert(heap.top() == ("c", 3));
    assert(heap.top() == ("b", 2));
  }

  test("peak() should return a item with highest priority") {
    val heap = new Heap[String, Int]();
    heap.insert("a", 1)
    heap.insert("b", 2)
    heap.insert("c", 3)
    assert(heap.top() == ("c", 3));
    assert(heap.top() == ("c", 3));
  }

  test("a item with highest priority should be inserted into index 0") {
    val heap = new Heap[String, Int]();
    heap.insert("a", 1)
    heap.insert("b", 2)
    heap.insert("c", 3)
    heap.insert("d", 4)
    assert(heap.peek() == ("d", 4))
  }
}
