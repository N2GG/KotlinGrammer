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
//ex.1

open class Human (val name : String = "Anonymous"){

    //constructor
    //주 생성자에게서 상속받기위해 this를 사용
    constructor(name : String, age : Int) : this(name) {
        println("My name is ${name}, ${age} years old")


    }

    //init 함수
    //주 생성자이기 때문에 constructor 블록이 몇개가 있든 init 블럭이 먼저 실행된다.

    init {
        println("New human has been borned!!")
    }


    //val name = name
    fun eatingCake() {
        println("This is so YUMMY")
    }

    open fun singASong() {
        println("Lalala")
    }
}

//코틀린에서 상속을 받기위해선 클래스를 open 해줘야하한다 go -> ex.1
//위의 영어로 작성된 singASong을 사용하려면 super 을 사용하면 된다
    class Korean : Human(){

        override fun singASong(){
        super.singASong()
            println("라라라")
            println("My name is ${name}")
        }

}



fun main(){
//    val human = Human("DaChan")
//    val stranger = Human()
    val korean = Korean()
    korean.singASong()
    val mom = Human("YeongIm", 58)



//    human.eatingCake()
//    println("This human name is ${stranger.name}")

}