fun main() {
    var number = 20

    // if (number % 2 != 0) println("$number is odd number");
    // if (number % 2 == 0) println("$number is even number");

    //OR ODDOREVEN 
    when (number % 2 == 0) {
        true -> println("$number is an Even Number")
        else -> println("$number is an Odd Number")
    }


}