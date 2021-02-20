object Two extends App {
  def penultimate(list: List[String]): String = {
    val length = list.length
    if (length > 1) {
      return list(length - 2)
    }

    null
  }

  val list_one = List("one", "two", "three")
  assert(penultimate(list_one) == "two")

  val list_two = List("five")
  assert(penultimate(list_two) == null)

  val list_three = List("six", "seven")
  assert(penultimate(list_three) == "six")
}
