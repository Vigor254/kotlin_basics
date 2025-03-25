fun main(args: Array<String>) {
    print("Enter Age:")
    val age=Integer.valueOf(readlnOrNull())
    if (age>=18){
        print("$age year old eligible to vote")
    }
    else{
        println("Not eligible to vote")
    }
    print("Enter the first number:")
    val num1=Integer.valueOf(readlnOrNull())
    print("Enter the second number:")
    val num2=Integer.valueOf(readlnOrNull())
    print("Enter the third number:")
    val num3=Integer.valueOf(readlnOrNull())
    if (num1>num2 && num2>num3){
        println("$num1 is greater than $num2 and $num3")
    }
    else if (num2>num1 && num1>num3){
        println("$num2 is greater than $num1 and $num3")
    }
    else if (num3>num1 && num3>num2)
        println("$num3 is greater than $num2 and $num1")
    else{
        println("All of the them are equal")
    }
}