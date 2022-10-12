fun main() {
    val function = FunctionSample()

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
    fun carBooking(carModel: String = "KIA Motors", carNo: Int, isItAvailable: Boolean = true) : Boolean{
        println("car model: $carModel \n carNo: $carNo \n ")
        if (isItAvailable)
            print("car is Available")
        else
            print("car is not Available")

        return isItAvailable
    }


}

