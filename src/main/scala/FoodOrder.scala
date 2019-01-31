class FoodOrder(val food : List[Dish]){

  def foodTotal() : Double = {
    food.map(food => food.price).sum

  }
}
