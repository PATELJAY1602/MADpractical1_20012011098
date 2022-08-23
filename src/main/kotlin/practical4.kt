fun main() {
    print("Enter the number : ")
    var n = readLine()!!.toInt()
    println(if (n%2==0)
        "Number is even"
    else
        "Number is odd"
    )
}
