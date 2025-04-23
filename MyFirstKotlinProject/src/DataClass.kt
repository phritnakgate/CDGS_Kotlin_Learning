fun main(){
    var student1 = Student("Boss",1)
    println(student1.toString())
    var student2 = student1.copy(id = 2)
    println(student2.toString())
}

data class Student(var name: String, var id: Int){}