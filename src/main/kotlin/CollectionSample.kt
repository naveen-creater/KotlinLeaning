import java.util.*

fun main() {

//    listSample()
//    setSample()
//    arraySample()
    mapSample()
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

    println(list intersect mutableList) // common values of 2 list
    println(list union mutableList) // add all values

    val list1 = listOf(1, 2, 3, 3)
    val list2 = listOf(3, 4, 5, 6)

    val u: Set<Int> = list1 intersect list2

    println(u)

    /*
    * here
    * union and intersect returns set not a list*/

}

fun mapSample() {
    val maps = mapOf("naveen" to 26, "sathish" to 28, "kalappan" to 56, "thenmozhi" to 45)
    val mutableMap: MutableMap<String, Int> = mutableMapOf()
    mutableMap.putAll(maps)
    mutableMap.put("arun",31)

    println(mutableMap.count{
        it.value > 30
    })


    //filters
    val allFilers = mutableMap.filter {
        it.value > 30 || it.key.equals("naveen")
    }

    val filterKeys = mutableMap.filterKeys {
        it.equals("Thenmozhi", true)
    }
    println(filterKeys)

    val filterValues = mutableMap.filterValues {
        it < 50
    }

    println(mutableMap.get("NotName"))
    //get default value
    println(mutableMap.getOrDefault("NotName", -1))


}

fun setSample() {
    val name = setOf("naveen", "kumar", "naveen", "pondy")
    val area = mutableSetOf("pondy", "chennai", "bangalore")

    println(name intersect area)

}

fun loop() {
    val i = 1..10
    for (ey in i) {
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


