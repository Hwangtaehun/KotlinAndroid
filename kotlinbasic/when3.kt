fun main() {
    var data: Any = 10
    when (data) {
        is String -> println("data is String")
        20, 30 -> println("data is 20 or 30")
        in 1..10 -> println("data is 1..10")
        else -> println("data is not valid")
    }
}