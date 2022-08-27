import kotlin.random.Random

open class Fish(name: String, maxAge: Int, energy: Int, weight: Int, age: Int) : Animal(name,
    maxAge,
    energy,
    weight,
    age) {

    override fun move(){
        println("$name is floats")
    }

    override fun theEnd() {
        if (age >= maxAge || energy < 0 || weight <0) {
            isTooOld = true
        println("$name left us")
        }
    }


    override fun eat(){
        energy += 3
        weight ++
        age ++
        println("$name is eat")
    }

    override fun birth(): Fish{
        energy -= 20
        weight -= 2
        age ++
        numbersOfA ++

        val randomEnergy = Random.nextInt(1, 10)
        val randomWeight = Random.nextInt(1,5)
        val babyFish = Fish( name, maxAge, randomEnergy, randomWeight, age)
        println("The fish $name gave birth to a baby $name, max age $maxAge, energy $randomEnergy, weight $randomWeight")

        return Fish(name, maxAge,energy, weight, age)
    }
}

