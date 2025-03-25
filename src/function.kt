fun myfunction(){
    println("this is my custom function")

}
fun main(args: Array<String>) {
    myfunction()
    fun addtwonum(){
        print("Enter the first number:")
        val num=Integer.valueOf(readlnOrNull())
        print("Enter the second number:")
        val num2=Integer.valueOf(readlnOrNull())
        println("The sum of $num and $num2 is ${num+num2}")
    }
    addtwonum()

}
