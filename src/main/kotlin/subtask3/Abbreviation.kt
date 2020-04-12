package subtask3

import java.lang.StringBuilder

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {

        val rg = Regex("[^${b}]")

       val res = a.toUpperCase().replace(rg,"")
        return if (res.equals(b)){
            "YES"}
        else{
            "NO"
        }
    }
}
