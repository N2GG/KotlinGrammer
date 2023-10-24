package com.example.kotlingrammer

import androidx.compose.ui.text.toUpperCase


fun main() {
    println("${mail}")

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

fun checkNum(score : Int){
//ex.2
    when(score)
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

//Expression = 표현식 vs Statement  = 문장 의 차이
//코틀린에서 모든 함수는 표현식이다.
//ex.2 의 when(score) 같은 경우가 문장이다.

//5. Array and List

// Array는 기본적으로 메모리가 정해져 있다.

// List는 Immutablelist = List 와 MutableList 두종류가 존재한다

fun array(){
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val array2 = arrayOf(1,"d",3.4f)
    val list2 = listOf(1,"d",11L)

    array[0] = 3
    var result = list.get(0)

    val arraylist = arrayListOf<Int>()
    arraylist.add(10)
    arraylist.add(20)

//새로운 객체를 생성해서 할당을 하려는 경우에는 사용할 수 없다.
//arraylist = arrayLisfOf<Int>() = x

}

//6. 반복문 For / While

fun forandwhile(){

    val students = arrayListOf("Joyce", "James", "Jenny", "Paul")

    for (name in students){
        println("${name}")
    }

    for ((index, name) in students.withIndex()){
        println("${index+1}번째 학생 은 ${name}")
    }



    var sum : Int = 0
    for (i in 1..10) {
    // += 는 sum+ 와 같은표현이다

        sum += i

    }
    println(sum)
    //1부터 10까지 2단씩 뛰면서 더해라
    //즉 1 + 3 + 5 + 7 + 9 = 25가 나온다
    //var sum : Int = 0
    //for (i in 1..10 step 2){
    //  sum += i
    //}
    //downTo 10..1 = 10부터 1까지 10 9 8 ..1 순으로 더해라
    //1 untill 100 = 1부터 99까지 즉 100은 더하지 않는다
    //1..100 과의 다른점



    //index++가 println보다 앞에오면 먼저 더한뒤에 값을 출력하고 1..10
    //index++가 println보다 뒤에오면 값을 출력한 뒤에 더한다 0..9
    var index = 0
    while(index < 10){
        index++
        println("current index : ${index}")

    }
}

//7. Nullable / NonNull
//코틀린과 자바의 가장 큰 차이점

fun nullcheck(){
    //NPE : NULL pointer Exception

    var name : String = "DaChan" //NonNull 타입을 지정하지 않아도 된다

    var nullName : String? = null //Null 타입이고 ? 를 붙여야 하므로 타입을 항상 지정해줘야한다

    var nameInUppercase = name.toUpperCase()

    var nullNameInUppercase = nullName?.toUpperCase()

    // ?: 엘비스프레슬리 연산자

    val lastName : String? = "Jeong"

    val fullName = name + " " + (lastName?: "No lastName")

    println(fullName)



}

//!! Null이 아니라고 선언해줄때 사용한다

//fun ignoreNulls(String?) {
    //val mNotNull : String = str!! //절대로 Null이 사용될 리 없을때 사용한다 정말 확실할때만 사용한다
    //val upper = mNotNull.toUpperCase()


fun mail(){
    val email : String? = "DaChan@gmail.com"

    //let = 자신의 리시버 객체를 람다식 내부로 옮겨준다
    email?.let{
        println("My Email is ${email}")
    }
}

