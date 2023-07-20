package net.flow9.thisiskotlin.project_calculator

fun main() {

    var num1 = result("Num1").toString().toInt()
    var num2 = result("Num2").toString().toInt()

    var cal = Cal(_num1 = num1, _num2 = num2)
}

class Cal(_num1: Int, _num2: Int) {

    var num1 = _num1
    var num2 = _num2
    var plus = num1 + num2
    var minus = num1 - num2
    var multiple = num1 * num2
    var divide = num1 / num2
    var remain = num1 % num2

    init {
        while (true) {
            println("[1]더하기 [2]빼기 [3]곱하기 [4]나누기 [5]나머지")
            var selectNumber = result("selectNumber").toString().toInt()
            when (selectNumber) {
                1 -> {
                    println("${num1}+${num2} = ${plus}")
                }

                2 -> {
                    println("${num1}-${num2}= ${minus}")
                }

                3 -> {
                    println("${num1}*${num2}= ${multiple}")
                }

                4 -> {
                    println("${num1}/${num2}= ${divide}")
                }

                5 -> {
                    println("${num1}나누기${num2}의 나머지는 ${remain}입니다.")
                }

                else -> {
                    break
                }
            }
            break
        }
    }
}

fun result(type: String): Any? {
    return when (type) {
        "selectNumber" -> {
            println("번호를 선택해주세요")
            while (true) {
                try {
                    var selectNumber: String? = readLine()
                    return selectNumber?.toInt() ?: -1
                } catch (e: java.lang.Exception) {
                    println("번호를 다시 선택해주세요")
                }
            }
        }

        "Num1" -> {
            println("숫자를 입력해주세요")
            while (true) {
                try {
                    var originAge: String? = readLine()
                    return originAge?.toInt() ?: -1
                } catch (e: Exception) {
                    println("숫자를 다시 입력해주세요")
                }
            }
        }

        "Num2" -> {
            println("숫자를 입력해주세요")
            while (true) {
                try {
                    var originAge: String? = readLine()
                    return originAge?.toInt() ?: -1
                } catch (e: Exception) {
                    println("숫자를 다시 입력해주세요")
                }
            }
        }

        else -> {
            return "no"
        }
    }
}