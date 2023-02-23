fun main(){
    fact()
places()
    details()
    names("January","July", "December")
}
fun fact(){
    var fruits = arrayOf("Mangoes", "Oranges", "Apples", "Pineapple")
    println(fruits.contentToString())
}
fun places(){
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    var countries = println(cities.map { it.capitalize() })
    println(countries)
    }
fun details(){
    var numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
    println(numbers.get(2) + numbers.get(5))
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())

}
fun names (name1:String, name2:String, name3:String):String{
    var words = arrayOf(name1, name2, name3)
    return words.contentToString()
}



