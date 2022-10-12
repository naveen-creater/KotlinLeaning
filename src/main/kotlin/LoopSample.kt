fun main() {
    val loop = LoopSample()
    val list = mutableListOf("apple", "banana", "lemon", "tomato")

//    loop.listLoop(list)
    loop.listRange()
}


class LoopSample {
    fun loop() {
        val i = 1..10
        for (ey in i) {
            println(ey)
        }
    }

    fun listLoop(list: List<String>) {
        for (item in list) {
            println(item)
        }
    }

    fun listRange() {
        val list = mutableListOf("android", "ios", "blackBerry", "symbian")

        val range = 0..100

        for (i in range step 5) {
//            println(i)
        }

        val untilRange = 0 until 100
        val downTo = 50 downTo 5 step 5

        for (ip in untilRange) {
//            println(ip)
        }

        for (ins in downTo){
//            println(ins)
        }

        //for each Loop
        list.forEach {
//            println(it)
        }

        list.forEachIndexed { index, name ->
            println(index)
            println(name)
        }


    }


}