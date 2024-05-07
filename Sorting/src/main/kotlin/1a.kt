fun main() {
    val list2: MutableList<Int> = mutableListOf()
    enter_numbers(list2)

}

fun enter_numbers(list2:MutableList<Int>) {
    while (true) {
        println("Введите число: ")
        val type = readLine()!!
        val num: Int = type.toInt()
        list2.add(num)
        println("'Enter', чтобы продолжить ввод чисел")
        println("'q', чтобы завершить ввод чисел")
        val choose = readLine()!!
        val ch: String = choose.toString()
        if (ch == "q") {
            showfunc(list2)
            break
        }
    }
}

fun showfunc(list2:MutableList<Int>) {
    println(list2.sortedBy {it})
}