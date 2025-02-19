fun main() {
    val (a, b, c) = List(3) { readln().toInt() }
    if (a <= b && b <= c || a >= b && b >= c) {
        println("true")
    } else {
        println("false")
    }

}