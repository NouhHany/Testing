package Abstraction

class Dog : Animal() {
	override var averageAge: Int = 20


	override fun makeSound() {
		println("Woof")
	}
}
