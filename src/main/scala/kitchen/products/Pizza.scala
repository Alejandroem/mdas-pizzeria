package kitchen.products

import scala.collection.mutable.ArrayBuffer

class Pizza {
  private var _size = null
  private var _type = null
  private val _ingredients: ArrayBuffer[Ingredient] = ArrayBuffer[Ingredient]()

  def getSize = _size
  def getType = _type
  def getIngredients = _ingredients

}
