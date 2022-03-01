class TankHero(override val name: String, override val rarity: String): AttackHero(name,rarity), Hp {
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