

var options : String = ""
var username: String = ""


var player = Player("$username", 3, 1, 0, 20)
val kapmes = Weapon("kapmes", 3, 6 )




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
                level1b()
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
        Thread.sleep(500)
        println(player)
        Thread.sleep(500)
        println("je loopt verder door het bos")
        Thread.sleep(500)
        println("je ziet een huisje aan het einde van het pad")
        Thread.sleep(500)
        println("je besluit hier naartoe te gaan")
        Thread.sleep(1000)
        level2()
    }


    fun level1b() {
        println("je loopt verder het bos in")
        Thread.sleep(500)
        println("er schijnt licht door de bomen heen")
        Thread.sleep(500)
        println("je ziet dat er bomen gekapt zijn")
        Thread.sleep(500)
        println("je ziet een kapmes in een boom zitten")
        Thread.sleep(500)
        println("je besluit het kapmes te pakken")
        Thread.sleep(500)
        player.weapon = kapmes
        println("je hebt het kapmes gepakt!")
        Thread.sleep(500)
        println("opeens valt candice uit boom naar beneden")
        Thread.sleep(500)
        println("ze is een zombie geworden en komt voor je brein!")
        Thread.sleep(500)

        val Candice = Candice("Zombie Candice", 1)
        println("laat je brein niet opeten!")
        while(Candice.life > 0) {
            println("Steek haar neer")
            Thread.sleep(1000)
            println("typ 1 om aan te vallen")
            Thread.sleep(1000)
            println("typ 2 om te ontwijken")


        options = readLine().toString()

        if (Candice.life > 0) {
            println("Candice wil jou aanvallen")
        }

        when (options) {
            "1" -> {
                player.attack(Candice, player.weapon.minDamage, player.weapon.maxDamage)
                Candice.attack(player, 0, 2)
            }
            "2" -> {
                var number = (0..1).random()


                if (number == 0) {
                    println("je probeert weg te duiken")
                    Thread.sleep(500)
                    println("maar ze raakt je alsnog")
                    Candice.attack(player, 0, 2)
                } else {
                    println("je probeert weg te duiken")
                    Thread.sleep(1000)
                    println("je ontwijkt Zombie Candice maar net")
                    player.attack(Candice, player.weapon.minDamage, player.weapon.maxDamage)
                }
            }

                else -> {
                println("Dit nummer klopt niet ")
                }
            }
        }
        println("je hebt Zombie Candice verslagen!")
        Thread.sleep(500)
        println(player)
        Thread.sleep(500)
        println("je loopt verder door het bos")
        Thread.sleep(500)
        println("je ziet een huisje aan het einde van het pad")
        Thread.sleep(500)
        println("je besluit hier naartoe te gaan")
        Thread.sleep(1000)
        level2()
    }


    fun level2() {
        println("Je doet de deur van het huisje open")
        Thread.sleep(500)
        println("er staat een grote gloeiende poort in het midden van de kamer")
        Thread.sleep(500)
        println("opeens stapt dr. Doofenschmirtz eruit!")
        Thread.sleep(500)

        val Doofenschmirtz = Doofenschmirtz("Zombie Candice", 1)
        println("laat je brein niet opeten!")
        while(Doofenschmirtz.life > 0) {
            println("Steek haar neer")
            Thread.sleep(1000)
            println("typ 1 om aan te vallen")
            Thread.sleep(1000)
            println("typ 2 om te ontwijken")


            options = readLine().toString()

            if (Doofenschmirtz.life > 0) {
                println("dr. Doofenschmirtz wil jou aanvallen")
            }

            when (options) {
                "1" -> {
                    player.attack(Doofenschmirtz, player.weapon.minDamage, player.weapon.maxDamage)
                    Doofenschmirtz.attack(player, 0, 2)
                }
                "2" -> {
                    var number = (0..1).random()


                    if (number == 0) {
                        println("je probeert weg te duiken")
                        Thread.sleep(500)
                        println("maar hij raakt je alsnog")
                        Doofenschmirtz.attack(player, 0, 2)
                    } else {
                        println("je probeert weg te duiken")
                        Thread.sleep(1000)
                        println("je ontwijkt dr. Doofenschmirtz maar net")
                        player.attack(Doofenschmirtz, player.weapon.minDamage, player.weapon.maxDamage)
                    }
                }

                else -> {
                    println("Dit nummer klopt niet ")
                }
            }


        }
        println("de dokter is dood!")
        Thread.sleep(500)
        println("je kan nu veilig doorlopen naar het portaal!")
        Thread.sleep(1000)
        outro()
    }


    fun outro(){
        println("je bent door het portaal gelopen")
        Thread.sleep(1500)
        println("je wordt wakker in een witte ruimte")
        Thread.sleep(500)
        println("opeens hoor je vanuit de verte een stem")
        Thread.sleep(1000)
        println("welkom in de hemel!")
        Thread.sleep(500)
        println("je denkt bij jezelf: wat de fuck doe ik hier")
        Thread.sleep(500)
        println("Je hebt het spel gehaald $username")
        Thread.sleep(500)
        println("Sluit maar snel af en ga wat met je leven doen!")
        Thread.sleep(500)
    }