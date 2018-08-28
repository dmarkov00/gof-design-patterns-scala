package creational.builder

abstract class ColdDrink  extends Item {
  override def packing(): Packing = new Bottle()
}
