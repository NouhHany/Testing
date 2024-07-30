package Abstraction

class Cat : Animal() {
	override var averageAge: Int = 14


	override fun makeSound() {
		println("Meow")
	}
}
