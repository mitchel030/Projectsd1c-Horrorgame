

var options : String = ""
var username: String = ""


var player = Player("$username", 3, 1, 0, 20)





fun main(args: Array<String>) {

    println("voer hier je naam in en druk op enter")

    username = readLine().toString()
    player.name = username.toString()
    println(player)
    while (username!!.isBlank()) {
        println(username!!.isBlank())
        println("Dit is geen geldige naam")
        username = readLine().toString()
    }
        println("Top we gaan beginnen.")
        Thread.sleep(4000)
        intro()
}

    fun intro() {

        println("Het is midden in de nacht.")
        Thread.sleep(500)
        println("je bent verdwaald in het bos")
        Thread.sleep(500)
        println("je weet niet hoe je hier gekomen bent")
        Thread.sleep(500)
        println("je staat meteen voor een keuze:")
        Thread.sleep(2000)
        println("typ 1 om het linkerpad in te slaan")
        Thread.sleep(1000)
        println("typ 2 om het rechterpad in te slaan")


        var options : String = ""
        options = readLine().toString()

        when (options) {
            "1" -> {
                println("je hebt gekozen om het linkerpad in te slaan")
                Thread.sleep(1000)
                level1a()
            }
            "2" -> {
                println("je hebt gekozen om het rechterpad in te slaan")
                Thread.sleep(1000)
                level1b()
            }
        }
    }



