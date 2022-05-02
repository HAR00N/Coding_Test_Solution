fun main(args: Array<String>) {
    val a = 5
    val b = 3

    for (i: Int in 1..b){
        for (j: Int in 1..a) {
            print("*")
        }
        println()
    }
}