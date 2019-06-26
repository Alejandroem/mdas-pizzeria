package kitchen

import kitchen.characteristics.{Cheese, Medium, Onion, Original}

object PrincipalFP extends App {

  val margarita = PizzaFP(Medium, Original, Seq(Cheese, Onion))


}
