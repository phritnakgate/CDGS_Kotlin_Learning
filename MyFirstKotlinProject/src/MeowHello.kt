class Person (var name: String, var age: Int) {
    init{
        println("$name is $age years old")
    }
    fun happiBd(): String = "Happi ${age}th bd na ja, $name!"
}


fun main() {
    val personObj = Person("Bossza",21)
    val alive : Boolean = true
    println("${personObj.name} Hello & " + personObj.happiBd())
}
