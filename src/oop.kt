class Myclass {
    // data member
    var myname: String = "My name is John Mwaniki"
    // Member function
    fun display() {
        println(myname)
    }
}

class Car {
    var brand: String = ""
    var model: String = ""
    var yearofman: Int = 0
}

fun main(args: Array<String>) {
    // create an instance object of Myclass
    val myobj = Myclass()
    myobj.display()

    // create an instance object of Car
    val obj2 = Car()
    obj2.brand = "mercedes"  // Corrected spelling of "mercedes"
    obj2.model = "G-class"
    obj2.yearofman = 2024  // Changed to Int (was String in your code)

    println("My favourite car brand is ${obj2.brand}, model is ${obj2.model} and year of manufacture is ${obj2.yearofman}")}