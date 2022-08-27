open class Phoenix (name: String, ability: String, age: Int, energy: Int,
): MagicalAnimals (name, ability, age, energy) {

    override fun theEnd(){
        energy += 1000
        println("Choi is always alone")
    }
}