import kotlin.math.pow

fun main() {
    val number = 1634
    val numOfDigits = number.toString().length
    var sum = 0
    var remainingDigits = number

    while (remainingDigits > 0) {
        val lastDigit = remainingDigits % 10
        sum += lastDigit.toDouble().pow(numOfDigits).toInt()
        remainingDigits /= 10
    }

    if (number == sum) {
        println("An Armstrong number")
    }
    else {
        println("Armstrong number.")
    }
}