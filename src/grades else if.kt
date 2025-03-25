fun main(args: Array<String>) {
    print("Enter Marks:")
    val marks=Integer.valueOf(readlnOrNull())
    if (marks>=55)
        println("you have pass the exam")
    else{
        println("you have failed exam")
    }
    if (marks>=90)
        println("A" )
    else if (marks>=80)
        println("A-")
    else if (marks>=75)
        println("B+")
    else if (marks>=70)
        println("B")
    else if (marks>=65)
        println("B-")
    else if (marks>=60)
        println("C+")
    else if (marks>=55)
        println("C")
    else if (marks>=50)
        println("C-")
    else{
        println("E")
    }


}