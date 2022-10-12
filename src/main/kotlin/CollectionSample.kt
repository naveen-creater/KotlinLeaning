import java.util.*

fun main() {

listSample()
}

fun arraySample() {
    /*
    * Array is fixed size
    * Array accept multiple type of objects
    */

    val array = intArrayOf(1, 2, 3)
    val array1 = doubleArrayOf(1.0, 23.0, 45.0)
    val array2 = floatArrayOf()

    val mutArray = arrayOf("kljsnb", 827, 3.0f, 365.00, Arrays.toString(array))


    println(Arrays.toString(mutArray))
}

fun listSample() {
    /*
    *List is overcome the array limits(Array is not grawable is only fixed)
    * list is two types {1.mutable, 2.immutable}
    */

    //immutable
    val list = listOf(1, 23, 345, "sfsg", 23.015, "naveen")

    //mutable
    val mutableList = mutableListOf("naveen", "kumar")

    println(list intersect  mutableList) // common values of 2 list
    println(list union   mutableList) // add all values

    val list1 = listOf(1,2,3,3)
    val list2 = listOf(3,4,5,6)

    val u:Set<Int> = list1 intersect  list2

    println(u)

    /*
    * here
    * union and intersect returns set not a list*/

}

fun setSample(){
    val name = setOf("naveen", "kumar", "naveen", "pondy")
    val area = mutableSetOf("pondy", "chennai", "bangalore")

    println(name intersect  area)

}

fun loop(){
    val i = 1..10
    for (ey in i){
        println(ey)
    }
}

fun printNum() {
    println(132_85__78956)
    println(65.toChar())
    println('$')


    val myMutableList = mutableListOf(1, 2, 3, 4, 5)
    myMutableList.add(6)
    println(myMutableList)
}


