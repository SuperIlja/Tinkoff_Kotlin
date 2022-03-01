data class HeroTeam(private val team: Array<TankHero>) {

    private var summary_damage = 0

    fun teamInfo() {
        for (t in team) {
            summary_damage += t.damage
        }
        println("Summary hero damage $summary_damage")
    }


}