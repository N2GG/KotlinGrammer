package com.example.kotlingrammer


fun main() {
    checkNum(15)
}
//4. 조건식
//두 수를 입력해서 큰 숫자를 표기하는 프로그램을 만들어보자
    fun maxBy(a : Int, b : Int): Int {

    if(a > b){
        return a
    }else{
        return b
    }

}
//코틀린에선 삼항연산자를 생략할 수 있다.
fun maxBy2(a : Int, b : Int) : Int = if (a > b) a else b


//조건문 when

fun checkNum(score : Int) {
    when(score) {
        1 -> println("This is 1")
        2 -> println("This is 2")
        3, 4 -> println("This is 3 or 4")
        else -> println("I don't know")
    }

    var b = when(score){
        1 -> 1
        2 -> 2
        else -> 3
    }

    println("b : ${b}")

    when(score) {
        in 90..100 -> println("You are genious")
        in 10..80 -> println("Not bad")
        else -> println("Okay")
    }
}

