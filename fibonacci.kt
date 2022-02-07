fun main(){
    println("Enter three number: ")

    var y =readLine()!!.toInt()
    var x = readLine()!!.toInt()
    var z = readLine()!!.toInt()

    while (z <= y) {
        println("$z + ")

        var sum = z + x
        z = x
        x = sum

        
    }

}