val data4: Int by lazy {
	println("in lazy......")
	10
}

fun main() {
	println("in main......")
	println(data4 + 10)
	println(data4 + 10)
}

fun someFun() {
	var data1: Int = 10
	var data2: Int? = null
	
	data1 = data1 + 10
	data1 = data1.plus(10)
}