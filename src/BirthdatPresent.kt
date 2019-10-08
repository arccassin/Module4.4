import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter
import java.util.*

/**
 * Created by User on 08 Окт., 2019
 */

fun main(){
    val birthDay = LocalDate.parse("1990-12-02")
    val today = LocalDate.now();
    var tmpDate = birthDay
    var formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - EEE", Locale.ENGLISH)
    val period = Period.of(1,0,0)
    while (tmpDate < today){
        println("${formatter.format(tmpDate)}")
        tmpDate += period
    }
}