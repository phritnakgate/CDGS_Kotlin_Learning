fun main() {
    //List
    val imList = listOf<Int>(1, 2, 3) //Immutable
    var muList = mutableListOf(0, 1, 2, 3) //Mutable
    muList.add(4)
    muList.remove(0)
    muList.removeAt(1)
    println("List size is ${muList.size} | "+muList)

    //Map
    val imMap = mapOf<Int, String>(1 to "Apple", 2 to "Banana", 3 to "Coconut")
    var muMap = mutableMapOf(1 to "Apple", 2 to "Banana", 3 to "Coconut")
    muMap.put(4, "Durian")
    muMap.remove(2, "Banana")
    muMap.remove(1)
    println("Map size is ${muMap.size} | "+muMap)

    //Set
    val imSet = setOf<Int>(1, 2, 3)
    var muSet = mutableSetOf(1, 2, 3)
    muSet.add(3)
    muSet.add(4)
    muSet.remove(1)
    println("Set size is ${muSet.size} | "+muSet)
}

