fun main(args: Array<String>) {
    val n = readln().toInt()
    val a: Array<Array<Int>> = Array(n, { Array(n, { (0..9).random() }) })
    var sum: Int = 0
    for (i in 0..(n - 1)) {
        for (j in 0..(n - 1)) {
            print("${a[i][j]} ")
            if (i + j > n - 1) {
                sum += a[i][j]
            }
        }
        println()
    }
    println(sum)
}