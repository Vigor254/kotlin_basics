fun main(args: Array<String>) {
    val majina= arrayOf("Erick","john","mary","ken","joyce")
    println("My name is ${majina[1]}")
    for (e in majina)
        println(e)

    val nambari= arrayOf(4,5,6,7,8,9,2,1,3,0,-7,-4)
    println("${nambari[6]}")
    for (x in nambari)
        println(x)
    val fruits= arrayOf("mangoes","banana","orange","pineapple","strawberry")
    for (f in fruits)
        println(f)
    println("i like eating ${fruits[3]} every day")

}
