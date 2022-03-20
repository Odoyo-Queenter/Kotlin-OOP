fun main(){
    var Queen = Human("Queen",30,50)
    println(Queen.weight)
    Queen.eat(10)
    println(Queen.weight)
    Queen.speak("i love Kimberly")
    Queen.birthday()
    var faith = User("Faith","Kimberly","kimberlyfaith@gmail.com","0707747965","127568..")
    println(faith.firstName)
    println(faith.email)




}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
        weight+=foodWeight
        println("i am eating ${foodWeight}kgs of food")



    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        age++
        println(age)
    }

}
data class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:String){

}

