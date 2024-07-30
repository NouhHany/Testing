package Enum

fun main() {


	for (day in Days.values()) {
		println("${day.ordinal} = ${day.name} is weekend ${day.isWeekend}")
	}
}
