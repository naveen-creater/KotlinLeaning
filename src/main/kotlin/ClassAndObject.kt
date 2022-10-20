import java.awt.Color

fun main() {
    val nam = ClassAndObject("");
    val namw = ClassAndObject("", "");
}

class ClassAndObject {
    val name: String = ""

    constructor(na: String) {

    }

    constructor(fname: String, lName: String) : this(fname) {

    }

    init {
        println()
    }

}

class PrimaryConstruct(color: Color?) {

    constructor(name: String) : this(null) {

    }

    constructor(name: String, address: String) : this(null) {

    }

    init {
// TODO: 20-10-2022
        //this is first called
    }

    init {
        //this is 2nd called
    }
}