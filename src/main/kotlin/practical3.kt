fun main(){
    print("Student Enrollment No.: ")
    var num = readLine()!!.toLong()

    print("Student name name: ")
    var name= readLine()!!.toString()

    print("Student your Age: ")
    var age= readLine()!!.toInt()

    print("Student Branch: ")
    var branch= readLine()!!.toString()

    print("Student Class: ")
    var clas= readLine()!!.toString()

    print("Student  Batch: ")
    var batch= readLine()!!.toString()

    print("Student College name: ")
    var clg= readLine()!!.toString()

    print("University Name: ")
    var uni= readLine()!!.toString()



    println("********************")
    println("Student's Data:")
    println("Enrollment No.:$num")
    println("Name:$name")
    println("Age:$age")
    println("Branch:$branch")
    println("Class:$clas")
    println("Batch:$batch")
    println("College Name:$clg")
    println("University Name:$uni")
}