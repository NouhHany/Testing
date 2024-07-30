package nestedAndinnerClass

class OuterClass {
	var outerName = "Iam Outer Class"

	inner class NestedClass {
		var nestedName = "Iam nested class"

		fun printOuterClassName() {
			println(outerName)
		}
	}
}
