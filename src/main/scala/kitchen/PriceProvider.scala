package kitchen

import kitchen.characteristics._
import kitchen.products.Pizza

object PriceProvider {
  def getIngredientPrice() : Map[Ingredient, Price] = {
    Map(
      Cheese -> BigDecimal(1),
      Onion -> BigDecimal(1),
      Chicken -> BigDecimal(1),
      Barbecue -> BigDecimal(1)
    )
  }

  def getSizePrice() : Map[Size, Price] = {
    Map(
      Small -> BigDecimal(1),
      Medium -> BigDecimal(1),
      Large -> BigDecimal(1)
    )
  }

  def getTypePrice() : Map[Type, Price] = {
    Map(
      Original -> BigDecimal(1),
      Normal -> BigDecimal(1),
      Thick -> BigDecimal(1)
    )
  }

}
