package playground

object HelloWorld {
    def main(args:Array[String]): Unit = {
        println("Welcome to Blackjack!")

        val hand1 = Array("J", "2", "5")
        val hand2 = Array("7", "Q")

        val personDealer = Person("Dealer", hand1)
        val personSpieler = Person("Spieler", hand2)

        println(personDealer)
        println(personSpieler)
    }
}
