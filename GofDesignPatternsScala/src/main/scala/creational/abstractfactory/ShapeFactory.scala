package creational.abstractfactory

class ShapeFactory extends AbstractFactory {
  override def getColor(color: String): Option[Color] = Option(null)

  override def getShape(shapeType: String): Option[Shape] = {
    shapeType match {

      case "square" => Option(new Square())
      case "circle" => Option(new Rectangle())
      case _ => Some(null)
    }
  }
}
