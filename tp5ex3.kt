class User(var id: Int, var name: String, var email: String)

fun rechercheEmail(users: List<User>) {
    val charcheEmail = users.filter {
        it.email.endsWith("@gmail.com")
    }
    for (user in charcheEmail) {
        println(user.name)
    }
}
fun main(){
    val users = listOf(
        User(1, "mohamed", "mohamed@gmail.com"),
        User(2, "adam", "adam@gmail.com")
    )
    rechercheEmail(users)
}