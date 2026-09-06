class User {
    constructor(name: String) {
        println("constructor(name: String) call...")
    }
    constructor(name: String, count: Int) {
        println("constructor(name: String, count: Int) call...")
    }
}
fun main() {
    val user1 = User("kkang")
    val user2 = User("kkang", 10)
}