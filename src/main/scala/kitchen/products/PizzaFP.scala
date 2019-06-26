package kitchen.products

import kitchen.characteristics.{Ingredient, Size, Type}
import kitchen.utilities.SequenceUtils

case class PizzaFP (t:Type, s:Size, i:Seq[Ingredient]){

  def addIngredient(ingredient:Ingredient): PizzaFP = {
    this.copy(i = this.i:+ ingredient)
  }

  def modifyType(newType:Type): Unit ={
    this.copy(t = newType)
  }

  def modifySize(newSize:Size): Unit ={
    this.copy(s = newSize)
  }

  def removeIngredient(removedIngredient: Ingredient) = {
    val newIngredients = SequenceUtils.findElement(this.i, removedIngredient)
    this.copy(i = newIngredients)
  }

  def removeAllIngredients():PizzaFP = {
    this.copy(i = Seq[Ingredient]())
  }

}
