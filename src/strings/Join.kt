package strings

fun <T> joinToString(
        collection: Collection<T>,
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
): String {

    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)

    return result.toString()
}

fun <T> Collection<T>.joinToString2(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
): String {

    val result = StringBuilder(prefix)

    for ((index, element) in withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)

    return result.toString()
}

fun String.lastChar(): Char = this[this.length - 1]

fun String.lastChar2(): Char = get(length - 1)

fun Collection<String>.join(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
): String = joinToString2(separator, prefix, postfix)

val String.lastChar: Char
    get() = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value) {
        setCharAt(length - 1, value)
    }

fun main(args: Array<String>) {

    println("Kotlin".lastChar())
    println("Kotlin".lastChar2())
    println("Kotlin".lastChar)

    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'

    println(sb)
}
