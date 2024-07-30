package higherOrderFunction

fun main() {
	printTwoNumbers(::add)
	printTwoNumbers(lambda)
}

fun printTwoNumbers(func:(num1:Int, num2:Int) -> Int) {
	println(func(8,5))
}

fun add(n1:Int, n2:Int):Int {
	return n1+n2
}

val lambda = {x:Int, y:Int -> x*y}
