fun main(){
    print("Enter a month number: ")
    var m: Int = readLine()!!.toInt()

    when (m) {
        1 -> println("january")
        2 -> println("February")
        3 -> println("March")
        4 -> println("april")
        5 -> println("June")
        7 -> println("july")
        8 -> println("August")
        9 -> println("September")
        10-> println("October")
        11-> println("November")
        12-> println("December")

        else -> print("Please enter Proper Number")


    }
}
