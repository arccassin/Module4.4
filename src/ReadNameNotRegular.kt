/**
 * Created by User on 01 Окт., 2019
 */
fun main(){

    println("Введите ФИО через пробел")
    var fioString = readLine()!!.trim()
    var beginNumber = fioString.indexOf(' ')
    if (beginNumber < 0){
        println("Неверный формат записи")
        return
    }
    val family = fioString.substring(0, beginNumber)
    fioString = fioString.substring(beginNumber + 1)
    beginNumber = fioString.indexOf(' ')
    if (beginNumber < 0){
        println("Неверный формат записи")
        return
    }
    val name = fioString.substring(0, beginNumber)
    fioString = fioString.substring(beginNumber + 1)
    println("Фамилия: $family\nИмя: $name\nОтчество: $fioString")


}