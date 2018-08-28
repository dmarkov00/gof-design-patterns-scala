package creational.builder

abstract class Burger extends Item {
  override def packing(): Packing = new Wrapper
}
