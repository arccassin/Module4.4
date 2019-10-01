/**
 * Created by User on 01 Окт., 2019
 */
fun main() {
    val SYMBOL_RUS_BEGIN = 0x0410
    val SYMBOL_RUS_END = 0x042f
    val SYMBOL_EN_BEGIN = 0x0041
    val SYMBOL_EN_END = 0x005b

    var symbolCount = SYMBOL_RUS_END - SYMBOL_RUS_BEGIN + 1
    for (i in SYMBOL_RUS_BEGIN..SYMBOL_RUS_END){
        print("${i.toChar()}: $i\t\t\t${(i+symbolCount).toChar()}: ${i + symbolCount}\n")
    }
    print("\n")


    symbolCount = SYMBOL_EN_END - SYMBOL_EN_BEGIN + 6
    for (i in SYMBOL_EN_BEGIN..SYMBOL_EN_END){
        print("${i.toChar()}: $i\t\t\t${(i+symbolCount).toChar()}: ${i + symbolCount}\n")
    }
}