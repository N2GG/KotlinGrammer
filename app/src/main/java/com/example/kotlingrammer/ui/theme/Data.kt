package com.example.kotlingrammer.ui.theme

//data class 로 아래의 메소드가 전부 생성이 된 것이다
//toString(), hashCode(), equals(), copy()

//두 문장의 차이를 알아보자
data class Ticket(val companyName : String, val user : String, var date : String, var seatNum : Int)
class TicketNorm(val companyName : String, val user : String, var date : String, var seatNum : Int)

//Kotlin의 장점중 하나인 Data class를 한곳에 여러개를 만들 수 있고, 그로인해 관리도 수월하다
//class는 컴파일을 해보면 나오지만 주소값이 나오는걸 알 수 있다
//차이를 잘 기억해두자


fun main() {
    val ticketA = Ticket("Asiana", "Dachan", "July 15th", 15)
    val ticketB = TicketNorm("Asiana", "Dachan", "July 15th", 15)

    println(ticketA)
    println(ticketB)
}

