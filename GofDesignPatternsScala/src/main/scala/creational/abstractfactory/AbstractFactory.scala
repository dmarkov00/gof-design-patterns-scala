package creational.abstractfactory

abstract class AbstractFactory {
   def getColor(shapeType: String): Option[Color]

   def getShape(colorType: String): Option[Shape]
}
