import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val array = IntArray(n + 1)
    for (i in 0 until n) {
        array[i] = sc.nextInt()
    }
    Arrays.sort(array)

    for (i in 0 until n) {
        val a = array[i]
        if (a == array[i + 1]) {
            println(array[i])
        }
    }

}