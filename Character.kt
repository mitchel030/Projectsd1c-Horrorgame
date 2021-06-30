open class Character(var name: String, var life: Int = 3, var level: Int = 1, var score: Int = 0, var hitpoints: Int = 5) {
    open fun takeDamage(damage: Int) {
        val remainingHitpoints = hitpoints - damage
        if (remainingHitpoints > 0){
            hitpoints = remainingHitpoints
            println(" je hebt $damage tegen je gekregen. je hebt nog $hitpoints")
        }

    }
    override fun toString(): String {
        return  """
           name:        $name
           hitpoints:   $hitpoints
                """
    }
    open fun attack(character: Character, minDamage: Int, maxDamage: Int){
        val attackDamage = (minDamage..maxDamage).random()
        character.takeDamage(attackDamage)
    }
}