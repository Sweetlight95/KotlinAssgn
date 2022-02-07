fun main(){
    println("Enter two numbers: ")
    var y =readLine()!!.toInt()
    var x = readLine()!!.toInt()

    var z = x % y
    println("The remainder is: $z")

    z = x / y
    println("The Quotient is: $z")
}