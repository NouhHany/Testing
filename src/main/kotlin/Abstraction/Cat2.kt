package Abstraction

class Cat2 : Animal2, AnotherInterface {
	override var averageAge: Int = 15


	override fun makeSound() {
		println("Meow")
	}

	override var anotherVariable: Int = 19

}
