val data4: Int by lazy {
	println("in lazy......")
	10
}

fun main() {
	println("in mai n......")
	println(data4 + 10)
	println(data4 + 10)
}