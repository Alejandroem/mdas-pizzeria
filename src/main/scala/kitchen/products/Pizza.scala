package kitchen.products

import kitchen.characteristics.{Ingredient, Medium, Normal, Size, Type}

import scala.collection.mutable.ArrayBuffer

class Pizza {

  type Coste = BigDecimal

  private var _size:Size = Medium
  private var _type:Type = Normal
  private val _ingredients: ArrayBuffer[Ingredient] = ArrayBuffer[Ingredient]()

  def getSize = _size
  def getType = _type
  def getIngredients = _ingredients

  def setSize(s: Size): Unit ={
    _size = s
  }

  def setType(t:Type): Unit ={
    _type = t
  }


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
