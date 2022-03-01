fun main() {


    val Kolt = AttackHero("Kolt", "Usually", 438)
    val Derril = TankHero("Derril", "Usually", 550)
    val Bull = TankHero("Bull", "Super rare", 680)
    val Poko = SupportHero("Poko", "Rare", 350)

    val heroes = listOf(Kolt, Derril)
    heroes.forEach() {
        it.heroInfo()
    }

    val compare_heroes = listOf(Derril, Poko)
    compare_heroes.forEach() {
        it.damage()
        it.hpInfo()
    }

    val team_heroes = HeroTeam(arrayOf(Derril, Bull))
    team_heroes.teamInfo()
}
