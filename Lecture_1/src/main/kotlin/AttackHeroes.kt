open class AttackHeroes(override val name: String, override val rarity: String) :BrawlStarsHeroes {
    open fun HeroInfo () = "This is atack hero".prettyPrint()
}