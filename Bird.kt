import kotlin.random.Random

open class Bird (name: String,
                 maxAge: Int,
                 energy: Int,
                 weight: Int,
                 age: Int,
                 val flyingHeight: Int
             ): Animal (name,maxAge,weight,energy, age){

    override fun move() {
        println("$name is fly")
    }

     override fun theEnd() {
         if (age >= maxAge || energy < 0 || weight <0) {
             isTooOld = true
             println("The $name lived his short, cool life without a mortgage")
         }
     }

    override fun birth(): Bird {
        energy -= 20
        weight -= 2
        age ++
        numbersOfA ++

        val randomEnergy = Random.nextInt(1, 10)
        val randomWeight = Random.nextInt(1,5)
        val babyBird = Fish( name, maxAge, randomEnergy, randomWeight, age)
        println("The bird $name gave birth to a baby $name, max Age $maxAge, energy $randomEnergy, weight $randomWeight")

        return Bird(name, maxAge,energy, weight, age, flyingHeight)
    }

}