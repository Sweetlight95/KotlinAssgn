fun main() {

    println("Enter a number: ")
    // var number = 3ln
    var x = readLine()!!.toInt()
    var result: Long = 1
    for (i in 1..x){
        result *= i.toLong()
    }
    println("The factorial: $result")    
}