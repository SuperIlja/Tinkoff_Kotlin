interface BrawlStarsHeroes {
    val name: String
    val rarity: String

    fun animalInfo() = "Information about hero".prettyPrint()

    fun String.prettyPrint () {
        println("Name: $name Rarity: $rarity")
        println(this)
        println()
    }
}
