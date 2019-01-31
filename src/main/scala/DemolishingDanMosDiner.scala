object DemolishingDanMosDiner extends App{


  val starter1 = new Starter("Bucket Lentil Soup", 52.95)
  val starter2 = new Starter("Mug a Hot Waterz", 21.65)
  val starter3 = new Starter("Chopper Suey", 9.99)
  val starter4 = new Starter("Signature Organic Mixed Beard",66.666666666)

  val starter = List(starter1,starter2, starter3, starter4)

  val main1 = new Main("Meatball Burger", 125.33)
  val main2 = new Main("Pasta la Bléaché", 125.61)
  val main3 = new Main("Signature Organic Mixed Beard", 333.333333333)

  val main = List(main1, main2, main3)


  val dessert1 = new Dessert("Brenflakes Minus Fran", 0.01)
  val dessert2 = new Dessert("Signature Organic Mixed Beard", 99.99999999)
  val dessert3 = new Dessert("Caramelised Crushed Milk Glass", 34.95)

  val dessert = List(dessert1, dessert2, dessert3)

  new FoodMenu(starter, main, dessert)

  val customerFood = new FoodOrder(List(starter1, main2, dessert3))



  val alcoholicDrink1 = new AlcoholicDrink("Dandyboyo", 0.10)
  val alcoholicDrink2 = new AlcoholicDrink("Mug a Hot Waterz", 0.05)
  val alcoholicDrink3 = new AlcoholicDrink("Cap Morgans", 0.075)
  val alcoholicDrink4 = new AlcoholicDrink("Signature Mixed Beard Liqouré",0.01)

  val alcoholicDrink = List(alcoholicDrink1, alcoholicDrink2, alcoholicDrink3, alcoholicDrink4)

  val nonAlcoholicDrink1 = new NonAlcoholicDrink("Watta", 2.00)
  val nonAlcoholicDrink2 = new NonAlcoholicDrink("la Bléaché", 0.70)
  val nonAlcoholicDrink3 = new NonAlcoholicDrink("Signature Mixed Beard non-Liqouré", 0.09)

  val nonAlcoholicDrink = List(nonAlcoholicDrink1, nonAlcoholicDrink2, nonAlcoholicDrink3)

  new DrinkMenu(alcoholicDrink, nonAlcoholicDrink)

  val customerDrinks = new DrinkOrder(List(alcoholicDrink2, nonAlcoholicDrink1))

  val customerTotalOrder = new Order(customerFood, customerDrinks)

  println("Thank you, your total bill is: £" + customerTotalOrder.subTotal())
}
