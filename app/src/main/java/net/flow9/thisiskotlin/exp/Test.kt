package net.flow9.thisiskotlin.exp

fun main() {

    val num1 = result("Num1").toString().toInt()
    val num2 = result("Num2").toString().toInt()

    val cal1 = Cal(num1,num2)
    val add1 = AddOperation(num1, num2)
    val minus1 = SubstractOperation(num1, num2)
    val multiple1 = MultiplyOperation(num1, num2)
    val divide1 = DivideOperation(num1, num2)
    val remain1 = Remain(num1, num2)


    while (true) {
        println("[1]더하기 [2]빼기 [3]곱하기 [4]나누기 [5]나머지 [6]종료")
        val selectNumber = result("selectNumber").toString().toInt()
        when (selectNumber) {
            1 -> {
                println("${num1}+${num2} = ${add1.add}")
            }

            2 -> {
                println("${num1}-${num2}= ${minus1.minus}")
            }

            3 -> {
                println("${num1}*${num2}= ${multiple1.multiple}")
            }

            4 -> {
                println("${num1}/${num2}= ${divide1.divide}")
            }

            5 -> {
                println("${num1}나누기${num2}의 나머지는 ${remain1.remain}입니다.")
            }

            6 -> {
                println("계산기 종료")
                break
            }

            else -> {
                break
            }
        }
        break
    }
   }

open class Cal(num1:Int,num2: Int) {
    var _num1 =num1
    var _num2 = num2
    var add = _num1 + _num2
    var minus =_num1 -_num2
    var multiple = _num1 * _num2
    var divide = _num1 / _num2
    var remain = _num1 % _num2
    open fun addOperation(){
        add
    }
    open fun substractOperation(){
        minus
    }
    open fun multiplyOperation(){
        multiple
    }
    open fun divideOperation(){
        divide
    }
    open fun remain(){
        remain
    }


}

class AddOperation(num1: Int, num2: Int) :Cal(num1,num2){
    override fun addOperation(){
    }

}

class SubstractOperation(num1: Int, num2: Int):Cal(num1,num2) {
    override fun substractOperation(){

    }
}

class MultiplyOperation(num1: Int, num2: Int):Cal(num1,num2) {
    override fun multiplyOperation() {
    }
}

class DivideOperation(num1: Int, num2: Int):Cal(num1,num2) {
    override fun divideOperation(){
    }
}

class Remain(num1: Int, num2: Int):Cal(num1,num2) {
    override fun remain() {
    }
}
fun result(type: String): Any? {
    return when (type) {
        "selectNumber" -> {
            println("번호를 선택해주세요")
            while (true) {
                try {
                    val selectNumber: String? = readLine()
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
                    val originAge: String? = readLine()
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
                    val originAge: String? = readLine()
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