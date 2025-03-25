fun main(args: Array<String>) {
//    while loops
    var num=10
    while (num>=5){
        println("loop: $num")
        num-=2
    }
    val fruits= arrayOf("mangoes","banana","orange","pineapple","strawberry")
    fruits.sort()
    for (f in fruits){
        println(f)}
    val nambari= arrayOf(-4,5,6,0,3,-8,5,3,6,-2,-5,10)
    nambari.sort()
    for (n in nambari){
        println(n)}
}