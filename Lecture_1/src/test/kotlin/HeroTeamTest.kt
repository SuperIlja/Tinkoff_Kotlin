import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance (TestInstance.Lifecycle.PER_METHOD)
class HeroTeamTest {
    private val hero : TankHero = mockk()

    @Test
    fun `пустой массив героев`() {
        val heroTeam = HeroTeam(arrayOf())
        assertEquals (0, heroTeam.teamInfo())
    }

    @Test
    fun `один герой`() {
        every { hero.damage } returns 846
        val heroTeam = HeroTeam(arrayOf(hero))
        assertEquals (846, heroTeam.teamInfo())
        verify(exactly = 1) { hero.damage }
    }

    @Test
    fun `два и более героев`() {
        val heroes: Array<TankHero> = Array(1000) { mockk() }
        var summary_damage = 0
        heroes.forEach {
            val damage = (1..2000).random()
            every { it.damage } returns damage
            summary_damage += damage
        }
        val heroTeam = HeroTeam(heroes)
        assertEquals (summary_damage, heroTeam.teamInfo())
        heroes.forEach { verify(exactly = 1) { it.damage } }
    }
}