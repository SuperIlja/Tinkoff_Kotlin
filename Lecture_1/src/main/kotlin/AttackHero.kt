open class AttackHero(override val name: String, override val rarity: String, override val damage: Int) :BrawlStarsHero {
    open fun heroInfo () = "This is atack hero".prettyPrint()
}