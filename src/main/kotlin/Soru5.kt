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
