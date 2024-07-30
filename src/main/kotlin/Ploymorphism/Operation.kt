package Ploymorphism

class Operation : Calculator() {
	override fun calculate(num1: Int, num2: Int) {
		println(num2 * num1)
	}

	override fun calculate(num1: Double, num2: Double) {
		println(num1 - num2)
	}
}
