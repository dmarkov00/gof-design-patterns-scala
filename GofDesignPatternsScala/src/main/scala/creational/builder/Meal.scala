package creational.builder

class Meal {

  val items: List[Item] = List()

  def addItem(item: Item): Unit = {
    item :: items
  }

  def getCost: Float = {
    var cost = 0
    for (item <- items) {
      cost += item.price
    }
    cost
  }

  def showItems() = {
    for (item <- items) {
      printf("Item name " + item.name)
      printf("Item price " + item.price)
      printf("Item packing " + item.packing())
    }
  }
}
