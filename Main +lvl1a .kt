

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
        Thread.sleep(2500)
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

            }
        }
    }

    fun level1a() {
        println("je loopt het donkere bos in")
        Thread.sleep(500)
        println("hoe verder je loopt, hoe dichter de bomen op elkaar gaan staan")
        Thread.sleep(500)
        println("je komt er bijna niet meer doorheen")
        Thread.sleep(500)
        println("opeens springt perry het vogelbekdier voor je neus")
        Thread.sleep(500)
        println("hij wil met je vechten!")

        val Perry = Perry("Perry het Vogelbekdier", 1)
        println("pak dat blauwe beest aan!")
        while(Perry.life > 0) {
            println("Sla hem in elkaar!")
            Thread.sleep(1000)
            println("typ 1 om aan te vallen")
            Thread.sleep(1000)
            println("typ 2 om te ontwijken")


            options = readLine().toString()

            if (Perry.life > 0) {
                println("Perry wil jou aanvallen")
            }

            when (options) {
                "1" -> {
                    player.attack(Perry, player.weapon.minDamage, player.weapon.maxDamage)
                    Perry.attack(player, 0, 2)
                }
                "2" -> {
                    var number = (0..1).random()


                    if (number == 0) {
                        println("je probeert weg te duiken")
                        Thread.sleep(500)
                        println("maar hij raakt je alsnog")
                        Perry.attack(player, 0, 2)
                    } else {
                        println("je probeert weg te duiken")
                        Thread.sleep(1000)
                        println("je ontwijkt Perry maar net")
                        player.attack(Perry, player.weapon.minDamage, player.weapon.maxDamage)
                    }
                }

                else -> {
                    println("Dit nummer klopt niet ")
                }
            }
        }
        println("je hebt Perry verslagen!")
        println(player)

    }

