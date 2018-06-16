fun main(args: Array<String>) {

    val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    println(map)

    val map2 = mapOf(1.to("one"), 7.to("seven"), 53.to("fifty-three"))

    println(map2)

    val (number, name) = 1 to "one"

    val set = hashSetOf(1, 7, 53)

    for ((index, element) in set.withIndex()) {
        println("$index: $element")
    }
}

infix fun Any.to(other: Any) = Pair(this, other)

