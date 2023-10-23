package com.example.kotlingrammer


//1. 함수에 대해 알아보자
//리턴 타입이 없을 경우엔 Unit = Void와 같은기능 은 생략 가능하다.
fun main(){

    val name = " DaChan"
    val lastname = "Jeong"
    helloworld()
    println(add(4, 6))
    println("my name is${name + lastname} I'm 23")

//달러 기호를 사용하고 싶다면 \를 이용하자.
    println("This is 2\$ sir")
}

fun helloworld() : Unit {
    println("Hello Kotlin World")

}
//Kotlin은 변수이름을 먼저 쓰고, 변수타입을 나중에 쓴다. 타입의 첫 문자는 항상 대문자.
//리턴타입은 파라미터 이후에 fun바디 직전에 사용한다.
fun add(a : Int, b : Int) : Int {
    return a+b
}

//2. val vs var
//val = value = 변하지 않음. 발은 뗄 수가 없다
//var = variable = 변할 수 있음. = 바지는 갈아입을 수 있다.

fun hi() {

    val a : Int = 10
    var b : Int = 8

//자동추론 기능에 의해서 변수 타입을 생략할 수 있다.
//바로 값을 입력해 주지 않으면 생략할 수 없다.
    var c = 100
    val d = 99




}

//3. String Templeate
//ex, println("my name is ${name} I'm 23")
//ex, println("my name is ${name + lastname} I'm 23")
fun name() {
    val lastname = "Jeong"
    val name = "DaChan"
}