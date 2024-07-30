package inheritance

open class Person {
	var name : String? = null
	var age : Int? = null
	var sex : String? = null

	fun getInfo() {
		println("Name $name Age $age Sex $sex")
	}
}
