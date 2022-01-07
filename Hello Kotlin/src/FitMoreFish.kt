fun main(args: Array<String>) {
 println(canAddFish(10.0, listOf(3,3,3)))
 println(canAddFish(8.0, listOf(2,2,2), hasDecorations = false))
 println(canAddFish(9.0, listOf(1,1,2), 3))
 println(canAddFish(10.0, listOf(), 7, true))
}

/*Data
Rule: 1 inch - 1 fish - 1 gallon of water (total_fish_length <= 100% tank size)
Rule with decorations: total_length_fish (in inches) <= 80% tank size (in gallons)

1 gallon = 3.79 liters
 */

/*fun canAddFish(
 tankSize: Double,
 currentFish: List<Int>,
 fishSize: Int = 2,
 hasDecorations: Boolean = true): Boolean {

 //val gallonUnit = 3.79

 //Check available space
 //val tankSizeGallons = tankSize/gallonUnit
 val availableSize = if (hasDecorations) tankSize/100*80 else tankSize

 //Sum fish
 var sum = fishSize
 for (inch in currentFish) {
  sum += inch
 }
 println("Sum is $sum")

 //Check
 return sum <= availableSize
}*/

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
 return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)}