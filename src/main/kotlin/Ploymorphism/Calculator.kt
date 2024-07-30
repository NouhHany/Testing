package Ploymorphism

open class Calculator {
	open fun calculate(num1: Int, num2: Int) {
		println(num1 + num2)
	}

	open fun calculate(num1: Double, num2: Double) {
		println(num1 / num2)
	}
}
