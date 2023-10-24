package com.example.kotlingrammer

//8. Class의 상속, 정의하는법 Constructor 이용하는법
//class Human {
//
//    val name = "DaChan"
//    fun eatingCake() {
//        println("This is so YUMMY")
//    }
//}
//fun main(){
//    val human = Human()
//    human.eatingCake()
//    println("This human name is ${human.name}")
//
//}


//Constructor을 이용하면 이렇게 사용한다

class Human (val name : String = "Anonymous"){

    //val name = name
    fun eatingCake() {
        println("This is so YUMMY")
    }
}
fun main(){
    val human = Human("DaChan")
    val stranger = Human()

    human.eatingCake()
    println("This human name is ${stranger.name}")

}