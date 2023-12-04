fun main(args: Array<String>) {
    val data: List<String> = readln().split(" ")
    var counter: Int = 1
    for (i in 1..data.size - 1) {
        if (data[i] != data[i - 1]) {
            ++counter
        }
    }
    println(counter);
}