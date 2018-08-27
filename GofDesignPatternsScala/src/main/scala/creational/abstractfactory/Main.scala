package creational.abstractfactory

object Main {
  def main(args: Array[String]): Unit = {

    val abstractFactory: AbstractFactory = new ShapeFactory()

    val shape = abstractFactory.getShape("square")
    println(shape.get)

  }
}
