import java.util.*

fun main(){
    var index: Int
    val sc = Scanner(System.`in`)
    val s = sc.nextLine()
    val array = arrayOf("India", "Aus", "England", "Canada", "India", "USA", "USA", "Japan", "China", "UK")
    for (i in array.indices) {
        if (s == array[i]) {
            index = i
            println("country is found : $s at index $index")
        }
    }

}