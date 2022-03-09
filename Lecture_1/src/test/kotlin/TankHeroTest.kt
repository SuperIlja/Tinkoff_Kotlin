import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable

class TankHeroTest {

    private val hero = TankHero("Derril", "Usually", 550)

    @Test
    fun `проверка инициализации` () {
        assertAll("hero",
            Executable { assertEquals("Derril", hero.name) },
            Executable { assertEquals("Usually", hero.rarity) },
            Executable { assertEquals(550, hero.damage) }
        )
    }

    @Test
    fun `проверка вывода` () {
        val expected = "This is tank hero"
        assertEquals(hero.heroInfo(), expected)
    }

    @Test
    fun `проверка получения урона` () {
        val expected = 80
        hero.damage()
        assertEquals(hero.hpInfo(),expected)
    }

    @Test
    fun `проверка регенерации` () {
        val expected = 85
        hero.damage()
        hero.regeneration()
        assertEquals(hero.hpInfo(),expected)
    }

}