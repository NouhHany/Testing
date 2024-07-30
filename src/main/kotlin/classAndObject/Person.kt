package classAndObject

class Person {
	var name : String? = null
	var age : Int? = null
	var address : String? = null
	var nationnality : String? = null
	var job : String? = null

	fun walk() {
		println("Hi iam a $job and i can walk")
	}
	fun speak() {
		println("Hi iam a $job and i can speak")
	}
	fun sleep() {
		println("Hi iam a $job and i can sleep")
	}
	fun attributes() {
		println("$name $age $address $nationnality $job")
	}
}
