package kitchen

import kitchen.characteristics.{Cheese, Large, Onion, Thick}
import kitchen.products.Pizza

object Main extends App {

  val margarita = new Pizza
  margarita.addIngredient(Cheese)
  margarita.addIngredient(Onion)

  margarita.setSize(Large)

  margarita.setType(Thick)

}
