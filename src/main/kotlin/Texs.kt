fun main(args: Array<String>){
//Human().hello()
    val h = Human()
    h.hello()
    var age : Int = 25;//var定義變數可變
    val weight = 65.5 //val定義變數不可變,kotlin分號可有可無

    print(age + weight)

}

class  Human {
    fun hello(){
        println("Hello")

    }
}