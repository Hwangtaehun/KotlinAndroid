class User(name: String) {
    constructor(name: String, count: Int): this(name) {
        println("constructor(name: String, count: Int) call...")
    }
}
fun main() {
    val user = User("kkang", 10)
}