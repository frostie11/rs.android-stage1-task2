package subtask4

class Pangram {

    // TODO: Complete the following function
    fun getResult(inputString: String): String {
        if(isPangram(inputString)) {
            val vowels = arrayOf('a', 'e', 'i', 'o', 'u', 'y')
            val words = inputString.split(" ").filter { it != "" && it != "\n" }.toTypedArray()

            for (i in words.indices) {
                var pos = 0
                val word = words[i].toCharArray()

                for (char in word.indices) {
                    if (vowels.contains(word[char].toLowerCase())) {
                        word[char] = word[char].toUpperCase()
                        pos += 1
                    }
                }
                words[i] = pos.toString() + word.joinToString("")
            }
            var result = words.sortedBy { it.first() }.joinToString(" ")

            return result
        } else {
            val vowels = arrayOf('a', 'e', 'i', 'o', 'u', 'y')
            val words = inputString.split(" ").filter { it != "" && it != "\n" }.toTypedArray()

            for (i in words.indices) {
                var pos = 0
                val word = words[i].toCharArray()

                for (char in word.indices) {

                    if (!vowels.contains(word[char].toLowerCase()) && word[char].isLetter()) {
                        word[char] = word[char].toUpperCase()
                        pos += 1
                    }
                }
                words[i] = pos.toString() + word.joinToString("")
            }
            var result = words.sortedBy { it.first() }.joinToString(" ")

            return result
        }
    }

    fun isPangram(str: String): Boolean {
        var arrayOfLetters = arrayListOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')
        str.forEach { if (arrayOfLetters.contains(it.toLowerCase())) arrayOfLetters.remove(it.toLowerCase()) }
        return arrayOfLetters.isEmpty()
    }
}
