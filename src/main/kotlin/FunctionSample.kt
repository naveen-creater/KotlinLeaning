fun main() {
    val function = FunctionSample()

    //calling function default params
    function.carBooking(carNo = 10)
    function.carBooking(carNo = 10, carModel = "BMW", isItAvailable = false)
    function.carBooking("Ferrari", 45, false)

    //one line fun return
    println(function.carNumberplate("01"))
    println(function.carNumberplate("15"))

    //with null
    println(function.carAge(null))
    println(function.carAge("58"))

    //vararg function call
    bookGet("Programing", "java","kotlin","ktor","dart")

    //Lambda function call
    val lamda:(String) -> Unit = {na -> println(na.length)}
    lamFun("Naveen kumar", lamda)
}


class FunctionSample {
    //default function
    fun car() {
        println("car function")
    }

    fun carWithReturn(): Unit {
        println("car function with unit return")
    }

    //parameter fun
    fun car(name: String) {
        println("car Name $name")
    }

    //return type function
    fun carSerialNo(carName: String): Int {
        println("car s.no ${carName.length}")
        return carName.length
    }

    //default params with the function
    fun carBooking(carModel: String = "KIA Motors", carNo: Int, isItAvailable: Boolean = true): Boolean {
        println("car model: $carModel \ncarNo: $carNo ")
        if (isItAvailable)
            println("car is Available")
        else
            println("car is not Available")

        return isItAvailable
    }

    //one line function
    fun carNumberplate(num: String) = if (num.toInt() < 10) "PY $num" else "TN $num"

    //null return
    fun carAge(age: Any?): Int? {
        if (age != null) {
            if (age is String) {
                return age.toInt()
            }

            return null
        } else {
            return age
        }

    }


}

//vararg function
fun bookGet(name: String, vararg books: String) {
    println(name)
    books.forEach { println(it) }
}

//lambda function
fun lamFun(name:String, action:(String) ->Unit){
    println(name)
    action(name)
}

