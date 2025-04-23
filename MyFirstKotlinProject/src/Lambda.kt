fun main(){
    val listOfNum = mutableListOf<Int>()
    for(i in 1..10){
        listOfNum.add(i)
    }
    val result = higherOrder(listOfNum) {
        println("Number in process is $it")
        it % 2 == 0
    }
    println(result)
}

fun higherOrder(numbers : List<Int>, process: (Int) -> Boolean) : List<Int>{
    return numbers.filter(process)
}

