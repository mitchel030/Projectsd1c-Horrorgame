class Player(name: String, life: Int = 3, level: Int = 3, score: Int = 0, Hitpoints: Int) : Character(name, life, Hitpoints) {
    var weapon = Weapon("Vuisten", 0, 3)

}