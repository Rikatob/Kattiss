package KattisKotlin

import java.util.Scanner

fun main() {

    val sc = Scanner(System.`in`)

    while (true) {
        var n = sc.nextLine()
        if (n == "0") {
            break
        }
        var arrN = n.toList().map { it.toString().toInt() }
        var sumN = arrN.sum()
        var p = 11

        while (true) {
            var multi = n.toInt() * p
            var sumMulti = multi.toString().toList().sumOf { it.toString().toInt() }
            if (sumMulti == sumN) {
                println(p)
                break
            } else {
                p++
            }
        }


    }
}