fun main(){
    var attributes=Attributes("Cars","Benz","Blue",50)
    attributes.carry(52,50)
    attributes.carry(30,50)
    attributes.identity()
    println(attributes.calculateParkingFees(50))
    val matatu=Bus("curved","brand","white",60)
   println( matatu.maxTripFare(65.5))
    println(matatu.parkingFees(2))


}

open class cars(var make:String, var model:String, var color:String, var capacity:Int){

}

class Attributes( make:String,  model:String,  color:String,  capacity:Int) :cars(make, model,color,capacity){
    fun carry(people:Int,capacity: Int){
        var x = people - capacity
        if (people<=capacity){

            println("carry $people passengers")
        }

        else{
            println("over capacity by $x")
        }

    }

//    - identity() : Prints out the color, make and model in the following
//    format e.g: “I am a white subaru legacy”

fun identity(){
    println("I am a $color $make and $model")

}
//    - calculateParkingFees(hours: Int) : Calculates and returns the
//    parking fees by multiplying the hours by 20

    fun calculateParkingFees(hours:Int):Int{
         var parkingFees=(hours*20)
        return parkingFees


    }
}
//Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per trip
//

class Bus( make:String, model:String, color:String, capacity:Int) :cars(make, model,color,capacity){
    fun maxTripFare(fare: Double): Double {
        return fare

    }

    //    The bus’ calculateParkingFees method returns the product of hours and
//    the capacity of the bus

    fun parkingFees(hours: Int): Int {
        var fees =capacity*hours
        return fees
    }
//    Make use of inheritance to avoid duplication. Also be sure to instantiate both classes
//    and call each of the functions on the objects.
//

}
