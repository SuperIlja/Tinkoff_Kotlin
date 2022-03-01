fun main() {


    val Kolt = AttackHero ("Kolt", "Usually")
    val Derril = TankHero ("Bull", "Super rare")
    val Poko = SupportHero("Poko", "Rare")

    val heroes = listOf(Kolt, Derril)
    heroes.forEach(){
        it.heroInfo()
    }

    val compare_heroes = listOf(Derril, Poko)
    compare_heroes.forEach(){
        it.damage()
        it.hpInfo()
    }
}