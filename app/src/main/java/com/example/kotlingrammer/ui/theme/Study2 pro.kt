package com.example.kotlingrammer.ui.theme

//1. Lamda
//람다식은 우리가 마치 value 처럼 다룰 수 있는 익명함수이다
//람다의 기능
//1. 메소드에 파라미터로 넘겨줄 수 있다 ex. fun mayby(Lamda)
//2. return 값으로 이용할 수 있다

//람다의 기본 정의
//val lamdaName : Type = {argumentList -> codeBody}


//람다식을 만들어보자
val square  : (Int) -> (Int) = {number -> number*number}
//타입추론이 가능하기에 아래처럼 작성할 수도 있다.
//val square = {number : Int -> number*number}

val nameAge : (String, Int) -> (String) = {name : String, age : Int ->
    "My name is ${name}, I'm ${age}years old"
}
//위의 식도 마찬가지로
//val nameAge = {name : String, age : Int -> "My name is ${name}, I'm ${age} years old"}
//로 작성이 가능하다.

fun main() {
    println(square(12))
    println(nameAge("Dachan",31))
}