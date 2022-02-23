class SupportHeroes(override val name: String, override val rarity: String) :BrawlStarsHeroes, Hp {
    private var hp = 100

    override fun Damage() {
        hp -= 35
    }

    override fun Regeneration() {
        hp += 10
    }


    override fun HPinfo(): Int {
        "hp= $hp".prettyPrint()
        return hp
    }
}