interface BrawlStarsHero {
    val name: String
    val rarity: String
    val damage: Int


    fun animalInfo() = "Information about hero".prettyPrint()

    fun String.prettyPrint () {
        println("Name: $name Rarity: $rarity")
        println(this)
        println()
    }

}
