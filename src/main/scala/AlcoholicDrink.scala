class AlcoholicDrink (name: String, price : Double) extends Drink(name, price){

  override def oldEnough(age: Int): Boolean = age >= 18


}
