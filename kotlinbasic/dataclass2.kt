data class DataClass(val name: String, val email: String, val age: Int) {
    lateinit var address: String
    constructor(name: String, email: String, age: Int, address: String):
        this(name, email, age) {
        this.address = address
    }
}
fun main() {
    val obj1 = DataClass("kkang", "a@a.com", 10, "seoul")
    val obj2 = DataClass("kkang", "a@a.com", 10, "busan")
    println("obj1.equals(obj2) : ${obj1.equals(obj2)}")
}