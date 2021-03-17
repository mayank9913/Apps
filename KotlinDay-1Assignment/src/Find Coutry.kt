import java.util.*

fun main(){
    val sc = Scanner(System.`in`)
    var flag =0
    println("Enter the size of the array ")
    val n = sc.nextInt()
    println("Enter the countries")
    val array = arrayOfNulls<String>(n+1)

    for (i in 0.. n) {
        array[i] = sc.nextLine()
    }

    println(" Enter the Country to search")
    val search = sc.nextLine()

    for (i in 0 ..  n) {
        if (search == array[i]) {
            println("County $search is Found")
            break
        }else{
            val flag =1
        }
    }
if (flag ==1){
    print(" country not found")

}
}