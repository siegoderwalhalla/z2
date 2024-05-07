fun main() {
    /* val list5: MutableList<Int> = mutableListOf(-500, 0, 100, 200, 300, 400, 500) */
    val list6: MutableList<Int> = mutableListOf(500, 200, 0, 300, -50, -300)
    val num = -50
    binary_search(list6, num)

}

fun binary_search(list5:MutableList<Int>, num: Int) {
    val length = (list5.size - 1)
    var empty = 0
    if (length < 0) {
        empty = 1
        println("Вы передали пустой список")
    }
    val range = 0..length
    var flag = 0
    var index = 0
    for (i in range) {
        if (num == list5[i]) {
            index = i
            flag = 1
            break
        }
    }
    if (flag == 1) {
        print("Индекс числа в переданном массиве: ")
        println(index)
    }
    else {
        if (empty != 1) {
            print("Переданное число не содержится в массиве")
        }
    }

}