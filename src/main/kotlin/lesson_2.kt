fun lesson2() {
    val multiStringIndent = """
        ass
        asses
        assess
    """.trimIndent()

    val multiStringMargin = """
        |ass
        |asses
        |assess
    """.trimMargin()

    println(multiStringIndent)
    println(multiStringMargin)
}