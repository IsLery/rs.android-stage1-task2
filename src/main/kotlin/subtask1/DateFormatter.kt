package subtask1


import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.DateTimeFormatter


class DateFormatter {


    fun toTextDay(day: String, month: String, year: String): String {
        val date: LocalDate
        try {
            date = LocalDate.of(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day))
        }catch ( e: DateTimeException){
            return "Такого дня не существует"
        }

        val formatter = DateTimeFormatter.ofPattern("dd MMMM, EEEE")
        return date.format(formatter)
    }
}
