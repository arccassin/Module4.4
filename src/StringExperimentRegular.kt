/**
 * Created by User on 01 Окт., 2019
 */
fun main() {

    var text = "Вася заработал 50001 рублей, Петя - 7563 рубля, а Маша - 30000 рублей"

    var sumSalary: Int = 0;
    val strings = text.split(' ');
    for (s: String in strings){
        val i = s.toIntOrNull();
        if (i != null){
            sumSalary += i
        }
    }

    println("Сумма зарплат ${sumSalary}")

}