import kotlin.math.absoluteValue

fun getLastDigit(integer: Int): Int{
    return integer.absoluteValue % 10
}

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}