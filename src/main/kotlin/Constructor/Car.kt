package Constructor

import java.awt.Color

class Car {
	var name : String
	constructor(model:String,price:Int) {
		println("constructor1")
	}
	constructor(color:String) {
		println("constructor2")
	}
	constructor(model:String, color:String) :this("red"){
		println("constructor3")
	}
	init {
	    println("Hello iam init")
		name = "nouh"
	}

}
