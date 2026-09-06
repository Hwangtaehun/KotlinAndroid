class User(name: String, count: Int) {
    var name: String
    var count: Int
    init {
        this.name = name
        this.count = count
    }
    
    fun somefun() {
        println("name : $name, count : $count")
    }
}

fun main() {
    val user = User("kkang", 10)
    user.somefun()
}