import java.util.Scanner

fun practice1() = with(Scanner(System.`in`)){
    val num1 = nextInt()
    val num2 = nextInt()
    val a = num1+num2
    val b = num1-num2
    val c = num1*num2
    val d = num1/num2
    val e = num1%num2
    println("$a")
    println("$b")
    println("$c")
    println("$d")
    println("$e")
}

fun practice2() = with(Scanner(System.`in`)){
//    길이가 4인 배열을 선언하고 각 요소에 자연수를 입력받아 모든 요소의 합을 출력하는 프로그램을 작성하시오.
    var array :Array<Int>

    val num1 = nextInt()
    val num2 = nextInt()
    val num3 = nextInt()
    val num4 = nextInt()
    array = arrayOf(num1,num2,num3,num4)

    var sum:Int =0
    for (num in array){
        sum += num
    }
    print(sum)

    /*  정답
        fun main() = with(Scanner(System.`in`)) {
        val arr = Array(4) { nextInt() }
        println(arr.sum())
    }
     */

}

fun practice3() = with(Scanner(System.`in`)) {
//    100이하의 자연수인 점수 값을 입력받아 90점 이상일 때는 A
//    70점 이상일때는 B 그 외에는 “나락” 이라는 텍스트를
//    출력하도록 프로그램을 작성하시오
    val score = nextInt()

    when (score){
        in 90..100 -> println('A')
        in 70..89 -> println('B')
        else -> println("나락")
    }
}

fun practice4() = with(Scanner(System.`in`)) {
//    when을 이용해 1점 이상 30점 이하일 때는 “잘 못했어요”.
//    77점 일 때는 “행운의 점수” 100점 일 때는 “축하”
//    그 외에는 “^^” 라는 텍스를 출력하도록 프로그램을 작성하시오.
    val score = nextInt()

    when (score){
        in 1..30 -> println("잘 못했어요")
        77 -> println("행운의 점수")
        100 -> println("축하")
        else -> println("^^")
    }
}

fun main() = with(Scanner(System.`in`)){
    val a = nextInt()
    val b = nextInt()
    val c = nextInt()

    if(c - b <= 0) print("-1")
    else print((a / (c - b)) + 1)
}

