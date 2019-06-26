package kitchen

import kitchen.characteristics.{Barbecue, Cheese, Chicken, Large, Medium, Onion, Original, Thick}
import kitchen.products.PizzaFP

object PrincipalFP extends App {

  val margarita = PizzaFP(Medium, Original, Seq(Cheese, Onion))

  val margarollo = margarita.addIngredient(Chicken)

  val margarollocoa = margarita.addIngredient(Chicken).addIngredient(Barbecue)

  val largemargarollocoa = margarita.addIngredient(Chicken).addIngredient(Barbecue).modifySize(Large)


}
