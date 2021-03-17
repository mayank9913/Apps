fun main() {
    val languages = arrayOf("HTML", "CSS", "JAVA","JS","ANDROID")
    var count = 0
    for (i in languages.indices) {
        for (j in 0 until languages[i].length) {
           count++
        }
    }
    println(count)
}