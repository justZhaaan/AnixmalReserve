import kotlin.random.Random

open class Dog(name: String, maxAge: Int, energy: Int, weight: Int, age: Int) : Animal(name, maxAge, energy, weight, age) {

    override fun move() {
        println("$name is run")
    }

    override fun theEnd() {
        if (age >= maxAge || energy < 0 || weight <0) {
            isTooOld = true
            println("The Wafer moved to Korea and met its end there")
        }
    }



    override fun eat(){
        energy += 3
        weight ++
        age ++
        println("$name is eat")
    }

    override fun birth(): Dog {
        energy -= 20
        weight -= 2
        age ++
        numbersOfA ++

        val randomEnergy = Random.nextInt(1, 10)
        val randomWeight = Random.nextInt(1,5)
        val babyDog = Dog( name, maxAge, randomEnergy, randomWeight, age)
        println("The dog $name gave birth to a baby $name, max Age $maxAge, energy $randomEnergy, weight $randomWeight")

        return Dog(name, maxAge,energy, weight, age)
    }

}