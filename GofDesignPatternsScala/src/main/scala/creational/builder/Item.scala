package creational.builder

trait Item {
  def name: String
  def packing(): Packing
  def price: Double
}
