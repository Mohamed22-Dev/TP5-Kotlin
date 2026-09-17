class Product(val name: String, val price: Int, val quantity: Int){
fun TotalPrice(): Int {
return price * quantity
}
    fun AfficherDetails(){
     println("name is $name")
     println("price is $price")
     println("quantity is $quantity")
     println("total quantity is ${TotalPrice()}")
 }
}
fun main(){
     val prut = Product("laptup", 5000, 2)
    prut.TotalPrice()
    prut.AfficherDetails()
}