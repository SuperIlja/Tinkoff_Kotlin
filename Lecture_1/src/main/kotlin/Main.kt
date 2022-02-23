fun main() {


    val Kolt = AttackHeroes ("Kolt", "Usually")
    val Derril = TankHeroes ("Bull", "Super rare")
    val Poko = SupportHeroes("Poko", "Rare")

    val heroes = listOf(Kolt, Derril)
    heroes.forEach(){
        it.HeroInfo()
    }

    val compare_heroes = listOf(Derril, Poko)
    compare_heroes.forEach(){
        it.Damage()
        it.HPinfo()
    }
}