fun main() {
    // val year = 2022
    // // var leap = false

    // var leap = 
    // if (year % 100 == 0 || year % 400 == 0) {
    //         println("$year is a leap year")
            
    // } else {
    //     println("$year is not a leap year")
    // }
    // print("$leap")
    // println(if (leap) "$year is a leap year." else "$year is not a leap year.")

    //OR When leap

    var year = 2022
    when (year % 100 == 0) {
         true -> println("$year is a leap year")
        false -> println("$year is not a leap year.")    
    }


}