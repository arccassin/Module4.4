/**
 * Created by User on 01 Окт., 2019
 */
fun main() {

    var text = "Вася заработал 50001 рублей, Петя - 7563 рубля, а Маша - 30000 рублей"

    var beginIndex = text.indexOf(' ') + 1
    text = text.substring(beginIndex)
    beginIndex = text.indexOf(' ') + 1
    text = text.substring(beginIndex)
    beginIndex = text.indexOf(' ')

    val numVasya = text.substring(0, beginIndex).trim().toInt()

    beginIndex = text.lastIndexOf('-') + 1;
    text = text.substring(beginIndex).trim()
    beginIndex = text.indexOf(' ')

    val numMasha = text.substring(0, beginIndex).trim().toInt()

    println("Сумма зарплат Васи и Маши ${numVasya + numMasha}")

}