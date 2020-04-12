package subtask2

class TimeConverter {

    // TODO: Complete the following function
    fun toTextFormat(hour: String, minute: String): String {
        val arrayOfNumbers = arrayOf(
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen", "nineteen",
            "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six",
            "twenty seven", "twenty eight", "twenty nine", "half"
        )

        var hour = hour.toInt()
        var minute = minute.toInt()
        var res = ""

        if (minute == 0) {
            res = arrayOfNumbers[hour] + " o' clock"
        } else if (minute in 1..30) {
            if (minute == 1) {
                res = arrayOfNumbers[0] + " minute to " + arrayOfNumbers[hour]
            } else if (minute == 15 || minute == 30) {
                res = arrayOfNumbers[minute] + " past " + arrayOfNumbers[hour]
            } else {
                res = arrayOfNumbers[minute] + " minutes past " + arrayOfNumbers[hour]
            }
        } else if (minute in 31..59) {
            if (minute == 59) {
                res = arrayOfNumbers[0] + " minute to " + arrayOfNumbers[hour + 1]
            } else if (minute == 45) {
                res = arrayOfNumbers[60 - minute] + " to " + arrayOfNumbers[hour + 1]
            } else {
                res = arrayOfNumbers[60 - minute] + " minutes to " + arrayOfNumbers[hour + 1]
            }
        }
        return res
    }
}
