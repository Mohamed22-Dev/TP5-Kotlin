sealed class OperationResult
class Success(var data: String): OperationResult(){}
class Failure(var errorMessage: String): OperationResult(){}
class Loading(var mesage: String) : OperationResult()
fun gererResult(op : OperationResult){
    when(op){
        is Success -> println("Success")
        is Failure -> println("Failure")
        is Loading -> println("Loading")
    }
}
fun main(){
    val suc = Success("Hello")
    println(suc.data)
    val fail = Failure("Error")
    println(fail.errorMessage)
    val loading = Loading("loading")
    println(loading.mesage)
}

