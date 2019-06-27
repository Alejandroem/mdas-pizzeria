package kitchen

import kitchen.characteristics.{Barbecue, Cheese, Chicken, Large, Medium, Onion, Original}
import kitchen.products.PizzaFP

object MainFP extends App {

  val margarita = PizzaFP(Original, Medium, Seq(Cheese, Onion))

  val margarollo = margarita.addIngredient(Chicken)

  val margarollocoa = margarita.addIngredient(Chicken).addIngredient(Barbecue)

  val largemargarollocoa = margarita.addIngredient(Chicken).addIngredient(Barbecue).modifySize(Large)

  val pizzaPrice = largemargarollocoa.getPizzaPrice(
    PriceProvider.getIngredientPrice(),
    PriceProvider.getSizePrice(),
    PriceProvider.getTypePrice()
  )

  println(s"The pizza price is $pizzaPrice")
}
