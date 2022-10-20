class CompanionObjectClass {
    /*Companion object like static in java*/

    companion object {
        const val pi = 3.14f
        const val apiKey = "ADFG:KJHD:KABJ"
    }


    fun addNum(num1: Int, num2: Int) {
        println("Add: ${num1.plus(num2)}")
    }

}


object SingletonClass {

    //this is singleton class
    //singleton class inside all method and variable is like static access

    val name = "singleton class"

    fun multiplyNum(num1: Int, num2: Int) = "mul: ${num1 * num2}"


}


fun main() {
    //Companion object sample
    println(CompanionObjectClass.pi)

    println(CompanionObjectClass.apiKey)

    val comp = CompanionObjectClass()
    comp.addNum(13, 58)


    //singleton class sample
    val obj1 = SingletonClass
    val obj2 = SingletonClass

    println("================")

    println(obj1.hashCode())
    println(obj2.hashCode())

    println(obj1.name)
    println(obj1.multiplyNum(45, 25))
}