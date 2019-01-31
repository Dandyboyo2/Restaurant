class DrinkOrder (val drinks : List[Drink]){

  def drinkTotal(age : Int) : Double = {

    drinks.filter(eachDrink => eachDrink.oldEnough(age))
      .map(eachDrink => eachDrink.price)
      .sum

  }

}
