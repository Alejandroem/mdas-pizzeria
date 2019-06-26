package kitchen.products

import kitchen.characteristics.{Ingredient, Size, Type}

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

  def removeIngredient(i: Ingredient) = ???

  def removeAllIngredients():PizzaFP = {
    this.copy(i = Seq[Ingredient]())
  }

}
