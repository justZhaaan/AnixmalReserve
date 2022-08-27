open class MagicalAnimals(val name: String, val ability: String, var age: Int, var energy: Int) {

    var isTooOld = false

    open fun theEnd(){
        println("$name the magic has left us")
        energy = 0
        age = 0
    }


    open fun sleep(){
        energy += 1000
        println("$name is sleep")
    }

    open fun eat(){
        energy += 2000
        println("$name is eat")
    }

    open fun move(){
        energy -= 1
        println("$name is move")
    }

    open fun magic(){
        energy -= 5000
        isTooOld = true
        println(" $name wanted to show us magic, but it seems he's no longer in the Muggle world.")
        theEnd()
    }
}





