import kotlin.random.Random
class NatureReserve(){

    var childList = mutableListOf<Animal>()
    var deadList = mutableListOf<Animal>()

    var allAnimals : MutableList<Animal> = mutableListOf(
        Bird("Woody",12,30,10,6, 25),
        Bird("Daffy",12,35,15,6, 28),
        Bird("Blu",12,28,17,6, 30),
        Bird("Shiper",12,30,14,6, 35),
        Bird("Rico",12,32,13,6, 28),
        Fish("Falafel",12,20,20,1),
        Fish("Dori",12,30,33,1),
        Fish("Nemo",12,23,19,1),
        Dog("Hatiko",12,28,23,5),
        Dog("Kudjo",12,40,25,5)
    )

    var allMagicalAnimals: MutableList<MagicalAnimals> = mutableListOf(
        Unicorn("Severus", "publishes a rainbow",10, 100),
        Dragon("Toothless", "breathing fire", 10,100,10000),
        Phoenix("Tsoy", "always alive",  28,100)
    )


    fun liveCycle() {

        for (it in allAnimals) {
            when (Random.nextInt(1, 5)) {
                1 -> it.eat()
                2 -> it.move()
                3 -> it.sleep()
                4 -> childList.add(it.birth())
            }
            allAnimals.forEach {
                when {
                    it.isTooOld -> deadList.add(it)
                }
            }
        }
        allAnimals -= deadList
        allAnimals += childList
    }




    fun liveMagicCycle() {
        for ( it in allMagicalAnimals) {
            when (Random.nextInt(1, 4)){
                1 -> it.eat()
                2 -> it.move()
                3 -> it.sleep()
                4 -> it.magic()
            }
        }
    }


}


