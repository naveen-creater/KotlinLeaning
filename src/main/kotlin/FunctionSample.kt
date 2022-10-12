fun main() {
    val function = FunctionSample()

    //calling function default params
    function.carBooking(carNo = 10)
    function.carBooking(carNo = 10, carModel = "BMW", isItAvailable = false)
    function.carBooking("Ferrari", 45, false)

    //one line fun return
    println(function.carNumberplate("01"))
    println(function.carNumberplate("15"))
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


}

