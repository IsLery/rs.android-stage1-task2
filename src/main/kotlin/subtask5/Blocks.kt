package subtask5

import java.lang.StringBuilder
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {
        val oper = null
        return when (blockB){
            String :: class -> concatString(blockA)
            Int :: class -> sumOfInt(blockA)
            LocalDate :: class-> latestDate(blockA)
            else -> Any()
        }
    }

    private fun concatString(blockA: Array<Any>): String{
        val sb = StringBuilder()
        for(i in blockA.indices){
            if (blockA[i] is String){
                sb.append(blockA[i].toString())
            }
        }
        return sb.toString()
    }

    private fun sumOfInt(blockA: Array<Any>): Int{
        var sum = 0
        for(i in blockA.indices){
            if (blockA[i] is Int){
                sum += blockA[i] as Int
            }
        }
        return sum
    }

    private fun latestDate(blockA: Array<Any>): String{
        var date = LocalDate.MIN
        for(i in blockA.indices){
            if (blockA[i] is LocalDate){
                val tmp = blockA[i] as LocalDate
                if (date.isBefore(tmp)){
                    date = tmp
                }
            }
        }
        val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")
        return formatter.format(date)
    }
}
