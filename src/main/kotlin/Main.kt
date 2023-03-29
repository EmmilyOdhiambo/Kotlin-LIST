fun main() {
    var typ= listOf("Steph","Emmie","Joy","Maggy")
    println(typ)

    person()
    var people1=People("Maggy",45,30.5,55)
    var people2=People("Emmie",10,55.6,50)
    var people3=People("John",12,56.6,30)
    var people4=People("Faith",40,45.5,45)

    var people= listOf<People>(people1,people2,people3,people4)
    var pple=people.sortedByDescending {people->people.age }
    println(pple)
    var one = Vehicles("KGR",345)
    var two = Vehicles("OPY",106)
    var three = Vehicles("GTR",570)
    var four = Vehicles("SDR",875)
    var allVehicles= listOf(one,two,three,four)
    println(vehicleList(allVehicles))


}//1. Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc (2 points)
fun  Name(Name:List<String>):List<String> {
    Name.forEachIndexed { index, s ->
        if (index % 2 == 0) {
            println(s)
        }
    }
    return Name
}
//2. Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height (2 points)
fun person(){
    var heights = mutableListOf(10,20,30,40,50,60)
    println(heights.average())
    println(heights.sum())
}
//3. Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age (2 points)
class People (var name:String,var age:Int,var height:Double,var weight:Int)

//4. Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
//(1 points)
fun addperson(topple:List<People>):List<Any> {
    return listOf()
}
//5. Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list./
data class Vehicles(var registration:String, var mileage:Int)
    fun vehicleList(vehicle:List<Vehicles>):Int {
        var avg = 0
        vehicle.forEach { new ->
            new.mileage
            avg += new.mileage
        }
        var totalAvg = vehicle.count()
        return totalAvg
    }


