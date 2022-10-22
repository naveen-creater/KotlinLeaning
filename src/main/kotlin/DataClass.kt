data class DataClass(val name: String = "Naveen")

fun main() {

    val data1 = DataClass("Naveen")
    val data2 = DataClass("Kumar")

    println(data1)
    println(data2)
    println(data1 == data2)

}

