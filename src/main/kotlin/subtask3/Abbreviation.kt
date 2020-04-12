package subtask3

import java.lang.StringBuilder

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var test = StringBuilder(a.toUpperCase())
        var count = 0

        while(count != b.length && test.length >= b.length) {
            if(test[count] != b[count]) {
                test.deleteCharAt(count)
                count--
            }
            ++count
        }
        if (count == b.length)
            return "YES"
        else {
            return "NO"
        }
    }
}
