open class AttackHero(override val name: String, override val rarity: String) :BrawlStarsHero {
    open fun heroInfo () = "This is atack hero".prettyPrint()
}