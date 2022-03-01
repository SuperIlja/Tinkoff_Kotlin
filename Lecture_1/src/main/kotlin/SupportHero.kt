class SupportHero(override val name: String, override val rarity: String, override val damage: Int) :BrawlStarsHero, Hp {
    private var hp = 100

    override fun damage() {
        hp -= 35
    }

    override fun regeneration() {
        hp += 10
    }


    override fun hpInfo(): Int {
        "hp= $hp".prettyPrint()
        return hp
    }
}