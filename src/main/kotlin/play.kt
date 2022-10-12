fun main(){
  val obj = dataUser("Naveen")
  val obj1 = dataUser("kumar")

  val (name:String) = obj
    println(name)
    println(obj.component1())
    println(obj1.name)
    println(obj == obj1)
}

data class dataUser(val name:String)