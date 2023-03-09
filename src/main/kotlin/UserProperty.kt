class UserProperty(val name: String, val age:Int, val needCard:Boolean) {

    init {
        println("Hellow")
    }

    constructor(name: String, age: Int):this(name,age,needCard = false){

    }

    constructor(name: String):this(name,12){

    }

}