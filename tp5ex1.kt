sealed class Payment
class CashPayment(var amount : Double) : Payment() {

}
class CardPayment(var cardNumber : Int) : Payment()

class DigitalPayment(var accountNumber : Int) : Payment() {}

fun printPayment(py: Payment) {
    when (py) {
        is CardPayment -> {
            println("type : Card Payment ${py.cardNumber}")
        }
        is DigitalPayment -> {
            println("type : Digital Payment ${py.accountNumber}")
        }
        is CashPayment -> {
            println("type : Cash Payment ${py.amount}")
        }
    }
}
fun main(){
    val cash = CashPayment(15.0)
    println(cash.amount)
    val card= CardPayment(19)
    println(card.cardNumber)
    val dia = DigitalPayment(15)
    println(dia.accountNumber)
}