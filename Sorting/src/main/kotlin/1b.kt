fun main() {
    val list4: MutableList<Int> = mutableListOf()
    entering_numbers(list4)

}

fun entering_numbers(list4:MutableList<Int>) {
    while (true) {
        println("Введите число: ")
        val type = readLine()!!
        val num: Int = type.toInt()
        list4.add(num)
        println("'Enter', чтобы продолжить ввод чисел")
        println("'q', чтобы завершить ввод чисел")
        val choose = readLine()!!
        val ch: String = choose.toString()
        if (ch == "q") {
            sort_fun(list4)
            break
        }
    }
}

fun sort_fun(list4:MutableList<Int>) {
    println(list4)
    val length = (list4.size - 2)
    val range = 0..length
    for (j in range) {
        for (i in range) {
            if (list4[i] > list4[i + 1]) {
                var temp = list4[i]
                list4[i] = list4[i + 1]
                list4[i + 1] = temp
            }
        }
    }
    show_answer(list4)
}

fun show_answer(list4: MutableList<Int>) {
    print(list4)
}