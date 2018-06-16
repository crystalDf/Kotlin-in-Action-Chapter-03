fun main(args: Array<String>) {

    println("12.345-6.A".split("\\.|-".toRegex()))
    println("12.345-6.A".split(".", "-"))

    fun parsePath(path: String) {

        val directory = path.substringBeforeLast("/")
        val fullName = path.substringAfterLast("/")

        val fileName = fullName.substringBeforeLast(".")
        val extension = fullName.substringAfterLast(".")

        println("Dir: $directory, name: $fileName, extension: $extension")
    }

    parsePath("/Users/star/kotlin-book/chapter.adoc")

    fun parsePath2(path: String) {

        val regex = """(.+)/(.+)\.(.+)""".toRegex()
        val matchResult = regex.matchEntire(path)

        if (matchResult != null) {
            val (directory, fileName, extension) = matchResult.destructured
            println("Dir: $directory, name: $fileName, extension: $extension")
        }
    }

    parsePath2("/Users/star/kotlin-book/chapter.adoc")

    val kotlinLogo = """| //
                       .|//
                       .|/ \"""
    println(kotlinLogo.trimMargin("."))

    val price = """${'$'}99.9"""

    println(price)
}
