package kitchen.products

import kitchen.Price
import kitchen.characteristics.{Ingredient, Size, Type}
import kitchen.utilities.SequenceUtils

case class PizzaFP (t:Type, s:Size, i:Seq[Ingredient]){

  def addIngredient(ingredient:Ingredient): PizzaFP = {
    this.copy(i = this.i:+ ingredient)
  }

  def modifyType(newType:Type): PizzaFP ={
    this.copy(t = newType)
  }

  def modifySize(newSize:Size): PizzaFP ={
    this.copy(s = newSize)
  }

  def removeIngredient(removedIngredient: Ingredient) = {
    val newIngredients = SequenceUtils.findElement(this.i, removedIngredient)
    this.copy(i = newIngredients)
  }

  def removeAllIngredients():PizzaFP = {
    this.copy(i = Seq[Ingredient]())
  }

  def getPizzaPrice(
                     ingredientsPrice: Map[Ingredient, Price],
                     sizePrice: Map[Size, Price],
                     typePrice: Map[Type, Price]
                   ): Price = {
    val base = BigDecimal(10)
    val ingredientsAmount = this.i.size
    val price = base + 1.00 * ingredientsAmount
    price
  }

}
