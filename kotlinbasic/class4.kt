class User(val name: String, val count: Int) {
    fun someFun() {
        println("name : $name, count : $count")
    }
}

fun main() {
    val user = User("kkang", 10)
    user.someFun()
}