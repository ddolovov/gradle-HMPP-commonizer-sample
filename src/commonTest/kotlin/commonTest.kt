import kotlin.test.Test
import kotlin.test.assertTrue

class CommonTest {
    @Test
    fun test() {
        val greeting = GreetingProvider().getGreeting()
        assertTrue(expectedGreeting in greeting)
    }
}

expect val expectedGreeting: String
