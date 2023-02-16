import java.util.Scanner

fun main(args: Array<String>) = with(Scanner(System.`in`)){
    val str = next()
    var point = 0.0

    when (str){
      "A+" -> point = 4.3
      "A0" -> point = 4.0
      "A-" -> point = 3.7
    }
    println(point)
}