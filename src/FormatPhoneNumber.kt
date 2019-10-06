/**
 * Created by User on 06 Окт., 2019
 */
fun main() {
    do {
        var input = readLine()?.trim()
        if (input == null) {
            continue
        }
        if (input.equals("exit"))
            return

        input = input.replace(Regex("\\D"), "")
        var outS: String;

        if ((input.length > 8) and (input.length < 12)) {
            if (input.length == 10) {
                input = "7" + input
            }
            if ((input[0] != '7') && (input[0] != '8')) {
                outS = "Not valid first symbol"
            } else {
                outS = "+ 7 "
                var i: Int = 1
                while (i < input.length){
                    if (i == 4){
                        outS = outS.plus(' ')
                    }
                    if ((i == 7) or (i == 9)){
                        outS = outS.plus('-')
                    }
                    outS = outS.plus(input[i])
                    i++
                }
            }
        } else {
            outS = "Not valid"
        }
        println(outS)

    } while (true)
}

