open class Character(var name: String, var life: Int = 3, var hitpoints: Int = 5) {
    open fun takeDamage(damage: Int) {
        val remainingHitpoints = hitpoints - damage
        if (remainingHitpoints > 0){
            hitpoints = remainingHitpoints
            println(" je hebt $damage damage tegen je gekregen. je hebt nog $hitpoints hitpoints")
        }else {
            if (life < 1){
                life -= 1
                println(" je bent een leven kwijt")
            }else {
                life -= 1
                println("je tegenstander is dood")
            }
        }
    }
    override fun toString(): String {
        return  """
           name:        $name
           hitpoints:   $hitpoints
           life:        $life
                """
    }
    open fun attack(character: Enemy, minDamage: Int, maxDamage: Int){
        val attackDamage = (minDamage..maxDamage).random()
        character.takeDamage(attackDamage)
    }
}