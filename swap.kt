fun main() {
    var firstNumber = 34;
    var secondNumber = 45;
 

    var temp = firstNumber;
    firstNumber = secondNumber;
    secondNumber = temp;

    println("a = $firstNumber");
    println("b = $secondNumber");
}