package anonymousFunctions

fun main() {
	val result = anonymous(5,8)
	println(result)

	println(anonymous2.invoke(8,2))
}

val anonymous = fun(x:Int, y:Int):Int {
	return x+y

}
val anonymous2 = fun(a:Int, b:Int) = a-b

