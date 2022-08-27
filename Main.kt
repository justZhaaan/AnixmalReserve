
fun main() {

    val zoo = NatureReserve()
    zoo.liveCycle()
    zoo.liveMagicCycle()

    println("the number of common animals in the reserve ${zoo.allAnimals.count()}")

}

