open class TankHero(override val name: String, override val rarity: String, damage: Int): AttackHero(name,rarity, damage), Hp {
    override fun heroInfo () = "This is tank hero".prettyPrint()

    private var hp = 100

    override fun damage() {
        hp -= 20
    }

    override fun regeneration() {
        hp += 5
    }


    override fun hpInfo(): Int {
        "hp= $hp".prettyPrint()
        return hp
    }

}