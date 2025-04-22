fun isAlive(isA : Boolean) : String = if (isA) "Alive" else "Not Alive"

fun calGrade(pts: Int) : String {
    return if (pts in 0..39) "F"
    else if (pts in 40..59) "D"
    else if (pts in 60..69) "C"
    else if (pts in 70..79) "B"
    else if (pts in 80..100) "A"
    else "Invalid"
}

fun calGradeUsingWhen(pts: Int) : String = when (pts){
    in 0..39 -> "F"
    in 40..59 -> "D"
    in 60..69 -> "C"
    in 70..80 -> "B"
    in 80..100 -> "A"
    else -> "Invalid"
}

fun main(){
    val recvgrade = 80
    val recvGrade2 = 40
    val grade = calGrade(recvgrade)
    val grade2 = calGradeUsingWhen(recvGrade2)
    val isPassed = if(recvgrade > 40) "Passed" else "Failed"

    println("Your grade is $grade | Result "+isPassed)
    println("Your grade2 is $grade2 | ${isAlive(false)}")
}