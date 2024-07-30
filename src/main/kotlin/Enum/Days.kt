package Enum

enum class Days(val isWeekend: Boolean = false) {
	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY(isWeekend = true),
	SATURDAY
}
