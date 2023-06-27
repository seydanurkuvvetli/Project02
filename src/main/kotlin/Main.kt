/** Soru-1
fun main(args: Array<String>) {
val arrayList = arrayListOf("ayşe,fatma,ibrahim,deniz,melek")
println("Lütfen virgülle ayrılmış üç isim girin:")
var input : String = readLine()!!
val isimler = input?.split(",")?.map { it.trim() }?.toList()

if(isimler!=null&& isimler.size==3 ) {

arrayList.add(isimler.toString())
println(arrayList)

}
else{

println("hatali")
}
}
 */
/** SORU-2
fun main() {
val names = arrayListOf("Sinem", "Ali", "Hümeyra", "Cem", "Gizem")
names.sortedBy { it }
println("Lütfen bir isim girin")
var input : String = readLine()!!
if(input !=null && names.contains(input)){
println(input.toUpperCase().reversed())
}else{
println("listede yok")
}
}

 */
/** SORU-3
fun main() {
data class Student(val name: String, val age: Int, val school: String)

val students = arrayListOf(
Student("Ahmet", 20, "Üniversite A"),
Student("Ayşe", 27, "Üniversite B"),
Student("Mehmet", 22, "Üniversite C"),
Student("Fatma", 28, "Üniversite A"),
Student("Ali", 29, "Üniversite B"),
Student("Feyza", 24, "Üniversite A"),
Student("Berkay", 22, "Üniversite B"),
Student("Caner", 26, "Üniversite A")
)
val maxOgrenci = students.maxByOrNull { it.age }
val minOgrenci = students.minByOrNull { it.age }
if (maxOgrenci != null && minOgrenci != null) {
println(
"en büyük öğrenci: ${maxOgrenci.name},${students.indexOf(maxOgrenci)},en küçük öğrenci:${minOgrenci.name},${
students.indexOf(
minOgrenci
)
}"
)
}
val listele = students.filter { it.school == "Üniversite A" }
val buyukler = listele.filter { it.age > 25 }
val kucukler = listele.filter { it.age < 25 }
println("Yaşı 25'ten büyük olan öğrenciler:\n${buyukler}\n")
println("Yaşı 25'ten küçük veya eşit olan öğrenciler:\n${kucukler}\n")
}
 */
/** SORU-4
fun main() {
data class CoinResponse(val name: String, val coinId: String, val hashingAlgorithm: String?, val description: String, val image: String, val currentPrice: Double, val priceChangePercentage24h: Double)

data class CoinUI(val name: String, val coinId: String, val hashingAlgorithm: String?,val description: String, val image: String, val currentPrice: Double, val priceChangePercentage24h: Double)

val coinList = arrayListOf(
CoinResponse(
name = "Bitcoin",
coinId = "BTC",
hashingAlgorithm = "SHA-256",
description = "Bitcoin is a decentralized digital currency, without a central bank or single administrator.",
image = "https://example.com/bitcoin.png",
currentPrice = 34789.21,
priceChangePercentage24h = -2.34
),
CoinResponse(
name = "Ethereum",
coinId = "ETH",
hashingAlgorithm = "Ethash",
description = "Ethereum is an open-source, blockchain-based platform that enables developers to build and deploy smart contracts.",
image = "https://example.com/ethereum.png",
currentPrice = 2110.45,
priceChangePercentage24h = 0.78
),
CoinResponse(
name = "Litecoin",
coinId = "LTC",
hashingAlgorithm = "Scrypt",
description = "Litecoin is a peer-to-peer cryptocurrency that enables instant, near-zero cost payments to anyone in the world.",
image = "https://example.com/litecoin.png",
currentPrice = 129.57,
priceChangePercentage24h = -1.12
),
CoinResponse(
name = "Ripple",
coinId = "XRP",
hashingAlgorithm = null,
description = "Ripple is a digital payment protocol and cryptocurrency that is designed to facilitate fast, low-cost international money transfers.",
image = "https://example.com/ripple.png",
currentPrice = 0.5483,
priceChangePercentage24h = 1.45
)
)
val coinUIList = coinList.map { coinResponse ->
CoinUI(
name = coinResponse.name,
coinId = coinResponse.coinId,
hashingAlgorithm=coinResponse.hashingAlgorithm.toString(),
description = coinResponse.description,
image = coinResponse.image,
currentPrice =coinResponse.currentPrice,
priceChangePercentage24h = coinResponse.priceChangePercentage24h
)
}

for (coinUI in coinUIList) {
println("Name: ${coinUI.name}")
println("Coin ID: ${coinUI.coinId}")
println("hashingAlgorithm:${coinUI.hashingAlgorithm}")
println("Description: ${coinUI.description}")
println("Image: ${coinUI.image}")
println("currentPrice: ${coinUI.currentPrice}")
println("priceChangePercentage24h ${coinUI.priceChangePercentage24h}")
println()
}
}
 */
/** SORU-5

fun main() {
    data class Workers(val name: String, val salary: Double)

    val workers = arrayListOf(
        Workers("Ahmet Yılmaz", 15000.0),
        Workers("Ayşe Kaya", 32000.0),
        Workers("Mehmet Demir", 29000.0),
        Workers("Fatma Şahin", 18500.0)
    )
    val maas = workers.map { Workers(it.name, (it.salary * 0.35) + it.salary) }.shuffled().sortedBy { it.salary }
    val highSalary = maas.maxByOrNull { it.salary }
    print("en yüksek maaş:${highSalary}")
    val lowSalary = maas.minByOrNull { it.salary }
    print("en düşük maaş: ${lowSalary}")
    val salaryAverage = maas.map { it.salary }.average()
    println("Maaş Ortalaması: $salaryAverage")


}

*/
