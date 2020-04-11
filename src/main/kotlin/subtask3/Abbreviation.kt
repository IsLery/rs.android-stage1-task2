package subtask3

import java.lang.StringBuilder

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
//        val rg = Regex(".*(?:[&{b}]+).*")
//        return if(a.toUpperCase().matches(rg)) {
//            "YES"
//        } else {
//            "NO"
//        }
        val rg = Regex("[^${b}]")
//        a = a.toUpperCase()
//        val sb = StringBuilder
//        for (i in a.indices){
//            if (a[i])
//        }

       // val temp = b.replace("(.)(?=.*\\1","")
       val res = a.toUpperCase().replace(rg,"")
        return if (res.equals(b)){
            "YES"}
        else{
            "NO"
        }
    }
}
