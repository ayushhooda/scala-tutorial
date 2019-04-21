package lowertypebounds

/*
            Thing
              |
            Vehicle
        /     |         \
  Car       Motorcycle    Bicycle
  /   \                      |
Jeep  Coupe               Tricycle


*/

trait Thing

class Vehicle extends Thing

class Car extends Vehicle

class Jeep extends Car

class Coupe extends Car

class Motorcycle extends Vehicle

class Bicycle extends Vehicle

class Tricycle extends Bicycle

// We need to restrict parking to all subtypes of vehicle, above Tricycle

class Parking[A >: Bicycle <: Vehicle](val plaza: A)

object LowerTypeBounds extends App {

  // this won't compile
//  val parking1 = new Parking[AnyRef](new AnyRef)

  // this will compile
  val parking2 = new Parking[Bicycle](new Bicycle)

  // this won't compile
//  val parking3 = new Parking[Thing](new Thing{})


}