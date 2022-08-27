import Animal as Animal1

open class Animal(val name: String, val maxAge: Int, var energy: Int, var weight: Int, var age: Int) {

    var isTooOld = false
    var numbersOfA: Int = 0

    open fun theEnd() {
        if (age >= maxAge || energy < 0 || weight <0) {
            isTooOld = true
            println("our $name is now in paradise")
        }
    }

    open fun sleep(){
        energy += 5
        age++
        println("$name is sleep")
    }



    open fun eat(){
        energy += 3
        weight ++
        age ++
        println("$name is eat")
    }

    open fun move(){
        energy -= 5
        weight --
        age ++
        println("$name is move")

    }

     open fun birth(): Animal1 {
        energy -= 20
        weight -= 2
        age ++
        numbersOfA ++

        return Animal1(name, maxAge,energy,weight,age)}


}
