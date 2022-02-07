fun main() {
    val str = "Kotlin is a great language";
    val char = 'a';
    var frequency = 0;

    for (element in str) {
        if (char == element) {
            ++frequency
        }
    }
    println("Frequency of $char = $frequency")
}