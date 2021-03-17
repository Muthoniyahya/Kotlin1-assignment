import java.util.*

fun main() {
countries("America","Dubai","Kenya","Thailand")
    cities()
    numbers()
    val namesArray= arrayOf("Bilal","Iman","Aimal")
    println(Arrays.toString(namesArray))
}
fun countries(count1:String,count2:String,count3:String,count4:String) {
    val countryArray= arrayOf(count1,count2,count3,count4)
    println(Arrays.toString(countryArray))

}
fun cities(){
   val cityArray= arrayOf("harare","mumbai","dodoma","jakarta")
    println(cityArray[0].capitalize()+" "+cityArray[1].capitalize()+" "+cityArray[2].capitalize()+" "+cityArray[3].capitalize())

}
fun numbers(){
    var numberArray= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum=numberArray[1] + numberArray[4]
    println(sum)
    var index=numberArray.indexOf(158)
    println(index)
    var sortednumber=numberArray.sortedArray()
    println(Arrays.toString(sortednumber))

}
fun names(name1:String,name2:String,name3:String):Array<String> {
    var namesArray= arrayOf(name1,name2,name3)
    return namesArray
}