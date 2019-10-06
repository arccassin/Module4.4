/**
 * Created by User on 06 Окт., 2019
 */
fun main(){

    println("Введите ФИО через пробел")
    val strings = readLine()!!.trim().split(' ')

    val family = strings.get(0)
    val name = strings.get(1)
    val lastname = strings.get(2)

    println("Фамилия: $family\nИмя: $name\nОтчество: $lastname")


}