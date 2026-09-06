fun main() {
    var data = 10
    val result =  when {
        data <= 0 -> println("data is <= 0")
        data > 100 -> println("data is > 100")
        else ->  println("data is valid")
    }
    println(result)
}