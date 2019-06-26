package kitchen.products

import kitchen.characteristics.{Ingredient, Size, Type}

case class PizzaFP (t:Type, s:Size, i:Seq[Ingredient]){

  def addIngredient(i:Ingredient)

}
