/**
 * Created by User on 06 Окт., 2019
 */
fun main() {

    val text = "What Samuel dramatically quotes as Ezekiel 25:17 is this:\n" +
            "“The path of the righteous man is beset on all sides by the iniquities of the selfish and " +
            "the tyranny of evil men. Blessed is he, who in the name of charity and good will, shepherds " +
            "the weak through the valley of darkness, for he is truly his brother’s keeper and the finder " +
            "of lost children. And I will strike down upon thee with great vengeance and furious anger those" +
            " who would attempt to poison and destroy my brothers. And you will know my name is the Lord when " +
            "I lay my vengeance upon thee.”";

    val strings = text.split(' ');
    for (s: String in strings){
        println(s)
        }
}
