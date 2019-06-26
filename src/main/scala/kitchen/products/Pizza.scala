package kitchen.products

import kitchen.characteristics.Ingredient

import scala.collection.mutable.ArrayBuffer

class Pizza {

  type Coste = BigDecimal

  private var _size = null
  private var _type = null
  private val _ingredients: ArrayBuffer[Ingredient] = ArrayBuffer[Ingredient]()

  def getSize = _size
  def getType = _type
  def getIngredients = _ingredients

  def addIngredient(i:Ingredient) = {
    _ingredients += i
  }

  def removeIngredient(i: Ingredient) = {
    _ingredients -= i
  }

  def resetPizza(): Unit ={
    _ingredients.clear()
  }

}
