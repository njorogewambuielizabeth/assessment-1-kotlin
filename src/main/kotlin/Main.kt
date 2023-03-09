fun main() {
    word("Elizabeth","Wambui")
    var number = numbers(2)



    var home = wordy("school","mate")







}
fun word(name1:String,name2:String):String{
    var nam = name1 + name2
    return(nam)


}
fun numbers(numb:Array<Int>):Int{

    return (numb.min())
    return (numb.max())
    return (numb.average())

}
//3. Write and call a function that takes in a string and splits it into all the
//characters that constitute it. Your function should print out this output.

fun fruit(word:String){
    var word = "Mellon"
    println(word.)



}
//4. Write and call a function that takes in an array of strings, joins them all into
//one string and returns it.
fun wordy(name1:String,name2:String):Array<String>{
    var word = arrayOf("mary","for")


}
//5. Create a calculator class that is capable of the following functions:
//(i) Addition of any 2 numbers
//(ii) Subtraction between any 2 numbers
//(iii) Accurate division between any 2 numbers
//(iv) Multiplication of any 2 numbers
//Instantiate your calculator object and invoke all its functions
class Calculator(var add:Int, var subtract:Int,var divide:Double,multiplication:Double){
    fun addition(nam1:Int,nam2:Int):Int{
        add= nam1 + nam2
        return (add)

    }
    fun  subtraction(nam1:Int,nam2:Int):Int{
        subtract = nam2 - nam1
        return(subtract)

    }
    fun division(nam1:Double,nam2:Double):Int{
        divide =  nam1 %nam2
        return (divide)

    }

}