// Necessary import statement
import java.util.*

fun main(args: Array<String>) {
    // Create a Scanner object for taking input
    val reader = Scanner(System.`in`)

    // Get user name
    val userName = reader.nextLine()

    // Get number
    val num = reader.nextInt()
    print("Hello $userName, you have $num new notifications.")

    // Make sure to use string templates to format your message
    // YOUR CODE GOES HERE
}