interface BrawlStarsHero {
    val name: String
    val rarity: String
    val damage: Int


    fun info() = "Information about hero".prettyPrint()

    fun String.prettyPrint ():String {
        println("Name: $name Rarity: $rarity")
        println(this)
        println()
        return this
    }

}
