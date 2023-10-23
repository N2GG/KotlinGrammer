package com.example.kotlingrammer


//1. 함수에 대해 알아보자
//리턴 타입이 없을 경우엔 Unit = Void와 같은기능 은 생략 가능하다.
fun main(){
    helloworld()

}

fun helloworld() : Unit {
    println("Hello Kotlin World")
}