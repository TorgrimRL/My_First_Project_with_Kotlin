package first_project

fun main() {
    println("Earned amount:")
    println("Bubblegum: $202")
    println("Toffee: $118")
    println("Ice cream: $2250")
    println("Milk chocolate: $1680")
    println("Doughnut: $1075")
    println("Pancake: $80")
    val income = 5405

    println()
    println("Income: $$income")
    println("Staff expenses:")
    val staffExpenses = readln().toInt()
    println("Other expenses:")
    val otherExpenses = readln().toInt()
    println("Net Income: $${income - staffExpenses - otherExpenses}")
}