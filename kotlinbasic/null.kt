val data1: Nothing? = null

fun some1(): Nothing? {
    return null
}

fun some2(): Nothing {
    throw Exception()
}

var data1: Int = 10
data1 = null

var data2: Int? = 10
data2 = null

fun some(data1: Int): Int {
    return data1 * 10
}

fun someerror(data1: Int) {
    data1 = 20
}