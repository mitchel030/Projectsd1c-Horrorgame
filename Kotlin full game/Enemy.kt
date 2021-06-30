
open class Enemy(var name: String, var life: Int = 1, var hitpoints: Int = 5) {
    open fun takeDamage(damage: Int) {
        val remainingHitpoints = hitpoints - damage
        if (remainingHitpoints > 0){
            hitpoints = remainingHitpoints
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
    open fun attack(enemy: Character, minDamage: Int, maxDamage: Int){
        val attackDamage = (minDamage..maxDamage).random()
        enemy.takeDamage(attackDamage)
    }
}