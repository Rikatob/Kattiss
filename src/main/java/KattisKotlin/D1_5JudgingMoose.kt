package KattisKotlin

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    var l = sc.nextInt()
    var r = sc.nextInt()
    var result: String = ""

    if (l + r == 0) {
        result = "Not a moose"

    } else if (l == r ) {
        result = "Even ${l + r}"
    } else {
        result = "Odd ${l.coerceAtLeast(r) * 2}"
    }

    println(result)
}