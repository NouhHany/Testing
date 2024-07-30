package lambdaExpression

fun main() {
	val sum : (Int,Int) -> Int = { a: Int, b: Int -> a+b }
	println(sum(7,5))

	val sub = {x:Int, y:Int -> x-y}
	println(sub(8,5))

}
