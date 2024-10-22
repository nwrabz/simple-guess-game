import kotlin.random.Random

fun main() {
    //Generating random numbers
    var randomNum = Random.nextInt(1, 100)
    var inputs: Int? = 0

    println("Let's play a game! Pick a number from 1 to 100")
    while (inputs != randomNum) {
        try {
            println("Enter the number you think of: ")
            inputs = readln().toInt()

            when {
                inputs > randomNum -> println("$inputs is too high the number is $randomNum")
                inputs < randomNum -> println("$inputs is too low the number is $randomNum")
                else -> println("Congratulations your input: $inputs, matches ")
            }
        } catch (word: NumberFormatException){
            println("Not allowing words")
        }
    }
    
}