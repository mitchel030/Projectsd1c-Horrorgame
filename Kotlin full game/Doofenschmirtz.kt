class Doofenschmirtz(name: String, life: Int,) : Enemy(name, life){
    override fun takeDamage(damage: Int) {
        super.takeDamage(damage * 2)
    }
}