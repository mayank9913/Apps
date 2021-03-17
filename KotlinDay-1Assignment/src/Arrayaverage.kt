fun main() {

    val array = arrayOf(1, 2, 3, 4, 5)
    val array1 = arrayOf(-12, -39, 12, 41, 22, 44)
    averagefun(array)
    averagefun(array1)


}

fun averagefun(array: Array<Int>) {


    var sum = 0
    var count = 0
    for (i in array.indices) {
        sum = sum + array[i]
        count++
    }
    var average = sum / count
    println(" average is $average")
}