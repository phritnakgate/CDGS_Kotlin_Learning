fun main(){
    val name: String? = null
    val name2: String? = "Boss"

    //1. Safe Call
    println("Safe Call: ${name?.length}")
    println("Safe Call: ${name2?.length}")
    //2. Safe Call w/let
    name?.let{
        println("Safe Call with Let executed!")
    }
    name2?.let{
        println("Safe Call with Let executed!")
    }
    //3. Elvis Op
    val length = name?.length ?: -1
    val length2 = name2?.length ?: -1
    println("Elvis of name1 is $length | name2 is $length2")

    //4. Non-Null Assertion
    try {
        println("NonNull of name1 is ${name!!.length}")
    }catch (e:Exception){
        println("NonNull of name2 is ${name2!!.length}")
    }
}