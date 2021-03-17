import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val array = IntArray(n)
    for (i in 0 until  n) {
        array[i] = sc.nextInt()
    }
    Arrays.sort(array)

    for (i in 0 until n-1) {

        var a = array[i]

        if (a != array[i + 1]) {
            println(a)
        }
    }

}