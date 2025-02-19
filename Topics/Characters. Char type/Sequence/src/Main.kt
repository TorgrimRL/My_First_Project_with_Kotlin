fun main() {
    var (a, b, c) = List(3) {
        readln().first().lowercaseChar()
    }
    a += 2
    b += 1
    println(a == b && b == c)
}