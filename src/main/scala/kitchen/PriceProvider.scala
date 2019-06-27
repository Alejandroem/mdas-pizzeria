package kitchen

import kitchen.characteristics.{Barbecue, Cheese, Chicken, Ingredient, Onion}

object PriceProvider {
  def getIngredientPrice() : Map[Ingredient, Price] = {
    Map(
      Cheese -> BigDecimal(1),
      Onion -> BigDecimal(1),
      Chicken -> BigDecimal(1),
      Barbecue -> BigDecimal(1)
    )
  }
}
