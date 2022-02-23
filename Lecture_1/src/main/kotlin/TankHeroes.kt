class TankHeroes(override val name: String, override val rarity: String): AttackHeroes(name,rarity), Hp {
    override fun HeroInfo () = "This is tank hero".prettyPrint()

    private var hp = 100

    override fun Damage() {
        hp -= 20
    }

    override fun Regeneration() {
        hp += 5
    }


    override fun HPinfo(): Int {
        "hp= $hp".prettyPrint()
        return hp
    }

}