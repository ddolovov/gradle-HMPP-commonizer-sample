fun main() {
    val greeting = GreetingProvider().getGreeting()
    GreetingPrinter().printGreeting(greeting)
}

expect class GreetingProvider() {
    fun getGreeting(): String
}

expect class GreetingPrinter() {
    fun printGreeting(greeting: String)
}
