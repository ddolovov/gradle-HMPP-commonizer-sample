import platform.Foundation.NSLog

actual class GreetingPrinter {
    actual fun printGreeting(greeting: String) {
        NSLog("Greeting: $greeting")
    }
}
