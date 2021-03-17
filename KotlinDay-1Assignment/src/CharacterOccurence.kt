import java.util.*

fun main(){
    var count = 0
    val sc = Scanner(System.`in`)
    val str = sc.nextLine()
    for (i in 0 until str.length) {
        val c = str[i]
        for (j in 0 until str.length) {
            if (c == str[j]) {
                count++
            }
        }
        println("$c $count")
        count = 0
    }


}