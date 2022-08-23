fun main(args:Array<String>){
    val num = 4
    val factorial = fact(num)
    println("Factorial of $num is  : $factorial")
}
tailrec fun fact(n: Int, temp: Int = 1) : Int {
    return if (n == 1){
        temp
    }
    else{
        fact(n-1, temp*n)
    }
}
