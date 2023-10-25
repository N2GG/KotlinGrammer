package com.example.kotlingrammer.ui.theme

//1. Lamda
//람다식은 우리가 마치 value 처럼 다룰 수 있는 익명함수이다
//람다의 기능
//1. 메소드에 파라미터로 넘겨줄 수 있다 ex. fun mayby(Lamda)
//2. return 값으로 이용할 수 있다

//람다의 기본 정의
//val lamdaName : Type = {argumentList -> codeBody}


//람다식을 만들어보자
val square = {number : Int -> number*number}
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



    //ex.2
    val a = "DaChan"
    val b = "Jeong"

    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    //ex.3
    println(extendString("Dachan", 31))


    //ex.4
    println(calculateGrade(110))


    //ex.5
    val lamda = {number : Double -> number == 4.234}

    println(invokeLamda(lamda))

    //함수 선언을 lamda로 하였지만 그걸 사용하지 않고 바로 {}로 사용할수 있는데 이를 람다 리터럴이라 한다
    println(invokeLamda({it > 6}))

    //만약 Function의 마지막 파라미터가 lamda식일 경우에 밑 처럼 ()를 생략을 할 수 있다
    //위의 식과 같다
    println(invokeLamda{it > 6})



}

//2. 확장함수
//익명함수이자 String 함수를 확장한다
//ex.2 참조
val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the Best!!"
}

//확장함수의 다른예를 알아보자
//ex.3
fun extendString(name : String, age : Int) : (String) {
    //밑의 introduceMyself 처럼 파라미터가 딱 하나(Int) 있을경우엔, it 을사용하여 받아올 수 있다.
    val introduceMyself : String.(Int) -> String = {"My name is ${this} and I'm ${it} years old"}
    return name.introduceMyself(age)
}

//람다의 Return
//기본적으로 람다는 마지막 한줄이 return을 의미한다
//ex.4 범위값을 지정해줄 때에, 이외의 값, 즉 else로 마무리 하지않으면 에러가 발생한다.

//ex.4
val calculateGrade : (Int) -> String = {
    when(it) {
        in 0..40 -> "fail"
        in 41.. 70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}


//람다를 표현하는 여러가지 방법

//ex.5
fun invokeLamda(lamda : (Double) -> Boolean) : Boolean {
    return lamda(5.2466)

}