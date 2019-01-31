

class Order (foodOrder : FoodOrder, drinkOrder: DrinkOrder){

  def subTotal() : Double = {
    drinkOrder.drinkTotal(19) + foodOrder.foodTotal()
  }
}
