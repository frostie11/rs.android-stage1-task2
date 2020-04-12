package subtask6

class Fibonacci {

    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {
        var F = arrayOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233)
        var count = 0
        var prod = 0
        var flag = false
        while (0 < 1) {
            prod = F[count + 1] * F[count]
            if(prod == n) {
                flag = true
                break
            } else if (prod > n) {
                break
            }
            count++
        }
        if (flag) {
            return intArrayOf(F[count], F[count + 1], 1)
        } else {
            return intArrayOf(F[count], F[count + 1], 0)
        }
    }
}
