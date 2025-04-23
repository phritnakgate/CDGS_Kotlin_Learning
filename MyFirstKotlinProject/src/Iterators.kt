fun main(){
    //For
    for(i in 0..4){
        println("For Meow")
    }
    //While
    var i = 0
    while(i < 5){
        println("While Meow")
        i++
    }
    i = 0
    //Do..While
    do{
        println("Do Meow")
        i++
    }while(i < 5)

    //List Application
    val l = listOf(10,20,30,40)
    for(i in l){
        print("$i ")
    }
    for((index,value) in l.withIndex()) println("$index : $value")

    //Map Application
    val imMap = mapOf<Int, String>(1 to "Apple", 2 to "Banana", 3 to "Coconut")
    for(key in imMap.keys){
        println("Key is $key, Value is ${imMap[key]}")
    }
}